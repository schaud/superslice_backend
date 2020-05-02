package dev.supremeteam.services;

import java.util.List;

import dev.supremeteam.entities.OrderForm;
import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.User;

public interface TicketService {

	Ticket createTicket(OrderForm orderForm);
	
	
}
