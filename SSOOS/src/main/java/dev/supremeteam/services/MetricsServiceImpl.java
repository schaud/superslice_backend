package dev.supremeteam.services;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.Topping;
import dev.supremeteam.entities.User;
import dev.supremeteam.repositories.TicketRepository;
import dev.supremeteam.repositories.ToppingRepository;
import dev.supremeteam.repositories.UserRepository;

@Component
@Service
public class MetricsServiceImpl implements MetricsService{
	
	@Autowired
	TicketRepository ticketRepo;
	@Autowired
	ToppingRepository toppingRepo;
	@Autowired
	UserRepository userRepo;

	@SuppressWarnings("deprecation")
	@Override
	public int[] getOrdersByTime() {
		int[] orders = new int[24];
		List<Ticket> tickets = ticketRepo.findAllByOrderByPlacementTimeAsc();
		for (Ticket ticket : tickets) {
			orders[ticket.getPlacementTime().getHours() - 1]++;
		}
		return orders;
	}

	@Override
	public Map<String, Integer> getTopToppings() {
		Map<String,Integer> top = new LinkedHashMap<String,Integer>();
		List<Topping> toppings = toppingRepo.findOrderedToppings();
		for (int i = 0; i < 5; i++) {
			top.put(toppings.get(i).getToppingName(),toppings.get(i).getPizzas().size());
		}
		return top;
	}

	@Override
	public int getTotalRevenue() {
		int revenue = 0;
		List<Ticket> tickets = (List<Ticket>) ticketRepo.findAll();
		for (Ticket t : tickets)
			revenue += t.getTotalCost();
		return revenue;
	}

	@Override
	public int getAverageTicketPrice() {
		int total = 0;
		int amount = 0;
		List<Ticket> tickets = (List<Ticket>) ticketRepo.findAll();
		for (Ticket t : tickets) {
			total += t.getTotalCost();
			amount ++;
		}
		return total/amount;
	}

	@Override
	public String[] getTopToppingNames() {
		String[] top = new String[5];
		List<Topping> toppings = toppingRepo.findOrderedToppings();
		for (int i = 0; i < 5; i++) {
//			top.put(toppings.get(i).getToppingName(),toppings.get(i).getPizzas().size());
			top[i] = toppings.get(i).getToppingName();
		}
		return top;
	}

	@Override
	public int[] getTopToppingAmounts() {
		int[] top = new int[5];
		List<Topping> toppings = toppingRepo.findOrderedToppings();
		for (int i = 0; i < 5; i++) {
//			top.put(toppings.get(i).getToppingName(),toppings.get(i).getPizzas().size());
			top[i] = toppings.get(i).getPizzas().size();
		}
		return top;
	}

	@Override
	public String[] getTopCustomerNames() {
		String[] names = new String[3];
		List<User> users = userRepo.findTopUsers();
		for (int i = 0; i < 3; i++) {
			names[i] = users.get(i).getUsername();
		}
		return names;
	}

	@Override
	public int[] getTopCustomerOrders() {
		int[] amounts = new int[3];
		List<User> users = userRepo.findTopUsers();
		for (int i = 0; i < 3; i++) {
			amounts[i] = users.get(i).getTickets().size();
		}
		return amounts;
	}

}
