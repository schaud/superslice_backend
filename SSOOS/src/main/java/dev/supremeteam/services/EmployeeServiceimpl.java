package dev.supremeteam.services;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.supremeteam.entities.*;
import dev.supremeteam.repositories.*;
@Component
@Service
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired 
	TicketRepository tr;
	@Override
	public Ticket updateTicket(Ticket t) {
		return tr.save(t);
	}

	@Override
	public List<Ticket> getTicketByUser(User u) {
		return u.getTickets();
	}

	@Override
	public Ticket getTicketById(int id) {
		return tr.findById(id).get();
	}
	
	@Override
	public List<Ticket> getAllTickets() {
		List<Ticket> tickets = (List<Ticket>) tr.findAll();	
		return tickets;
	}

	@Override
	public List<Ticket> getPendingTickets() {
		return tr.findByStatusOrderByTicketIdDesc("Pending");
	}

	@Override
	public List<Ticket> getIncompleteTickets() {
		return tr.findByStatusNotOrderByTicketIdDesc("Complete");
	}

	@Override
	public List<Ticket> getCompleteTickets() {
		return tr.findByStatusOrderByTicketIdDesc("Complete");
	}

	@Override
	public Ticket updateTicket(int id, String status) {
		Ticket ticket = tr.findById(id).get();
		ticket.setStatus(status);
		return tr.save(ticket);
	}

}
