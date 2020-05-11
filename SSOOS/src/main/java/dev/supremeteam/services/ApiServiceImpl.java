package dev.supremeteam.services;

import java.util.List;

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
public class ApiServiceImpl implements ApiService{

	@Autowired
	TicketRepository ticketRepo;
	@Autowired
	ToppingRepository toppingRepo;
	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<Ticket> getAllTickets() {
		return (List<Ticket>) ticketRepo.findAll();
	}

	@Override
	public List<Ticket> getUserTickets(String username) {
		User user = userRepo.findByUsername(username);
		return ticketRepo.findByUserOrderByTicketId(user);
	}

	@Override
	public List<Topping> getAllToppings() {
		return (List<Topping>) toppingRepo.findAll();
	}

	@Override
	public List<Topping> getToppingsByPopularity() {
		return toppingRepo.findOrderedToppings();
	}

	@Override
	public Topping createTopping(Topping topping) {
		topping.setToppingId(0);
		return toppingRepo.save(topping);
	}

	@Override
	public Topping getToppingById(int id) {
		return toppingRepo.findById(id).get();
	}

	@Override
	public Topping updateTopping(Topping topping) {
		return toppingRepo.save(topping);
	}

	@Override
	public boolean deleteTopping(Topping topping) {
		toppingRepo.delete(topping);
		return true;
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		ticket.setTicketId(0);
		return ticketRepo.save(ticket);
	}

	@Override
	public Ticket getTicketById(int id) {
		return ticketRepo.findById(id).get();
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		return ticketRepo.save(ticket);
	}

	@Override
	public boolean deleteTicket(Ticket ticket) {
		ticketRepo.delete(ticket);
		return true;
	}

	@Override
	public Topping getToppingByName(String name) {
		return toppingRepo.findByToppingName(name);
	}

}
