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
	public Set<Ticket> getTicketByUser(User u) {
		return u.getTickets();
	}

	@Override
	public Ticket getTicketById(int id) {
		return tr.findById(id).get();
	}

}
