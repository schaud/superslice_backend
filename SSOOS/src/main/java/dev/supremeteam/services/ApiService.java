package dev.supremeteam.services;

import java.util.List;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.Topping;

public interface ApiService {
	
	List<Ticket> getAllTickets();
	List<Ticket> getUserTickets(String username);
	
	List<Topping> getAllToppings();
	List<Topping> getToppingsByPopularity();
	
	//CRUD
	Topping createTopping(Topping topping);
	Topping getToppingById(int id);
	Topping getToppingByName(String name);
	Topping updateTopping(Topping topping);
	boolean deleteTopping(Topping topping);
	
	Ticket createTicket(Ticket ticket);
	Ticket getTicketById(int id);
	Ticket updateTicket(Ticket ticket);
	boolean deleteTicket(Ticket ticket);

}
