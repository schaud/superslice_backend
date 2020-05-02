package dev.supremeteam.services;

import java.util.List;

import dev.supremeteam.entities.OrderForm;
import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.User;

public interface TicketService {

	Ticket createTicket(OrderForm orderForm);
	
	
	Ticket createTicket(Ticket t);
	
	//Ticket getTicketById(int id);
	
	List<Ticket> getUserTickets(User u);
	
	Ticket updateTicket(Ticket t);
	
	Ticket deleteTicket(Ticket t);
}
