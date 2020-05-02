package dev.supremeteam.services;

import java.util.*;

import dev.supremeteam.entities.*;

public interface EmployeeService {
	Ticket updateTicket(Ticket t);
	
	Set<Ticket> getTicketByUser(User u);
	
	Ticket getTicketById(int id);
	
}
