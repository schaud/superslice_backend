package dev.supremeteam.services;

import dev.supremeteam.entities.*;

public interface UserService {
	User createUser(User u);
	
	User loginUser(String username, String password);
	
	Ticket createTicket(Ticket t);
	
}
