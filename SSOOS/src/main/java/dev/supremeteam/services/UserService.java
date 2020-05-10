package dev.supremeteam.services;

import java.util.List;

import dev.supremeteam.entities.*;

public interface UserService {
	User createUser(User u);
	
	User loginUser(String username, String password);
	User registerUser(String username, String password);
	
	Ticket createTicket(Ticket t);
	
	List<Ticket> getTicketsByUser(String username);
	
}
