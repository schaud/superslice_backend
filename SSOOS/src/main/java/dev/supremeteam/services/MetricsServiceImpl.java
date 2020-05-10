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

@Component
@Service
public class MetricsServiceImpl implements MetricsService{
	
	@Autowired
	TicketRepository ticketRepo;
	@Autowired
	ToppingRepository toppingRepo;

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
	public Map<User, Integer> getTopCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalRevenue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAverageTicketPrice() {
		// TODO Auto-generated method stub
		return 0;
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

}
