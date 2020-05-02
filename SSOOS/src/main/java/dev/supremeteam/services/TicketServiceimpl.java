package dev.supremeteam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.User;
import dev.supremeteam.repositories.TicketRepository;

public class TicketServiceimpl implements TicketService{
	@Autowired 
	TicketRepository tr;
	@Override
	public Ticket createTicket(Ticket t) {
		
		return tr.save(t);
	}

//	@Override
//	public Ticket getTicketById(int id) {
//		//return tr.findAllById(id);
//	}

	@Override
	public List<Ticket> getUserTickets(User u) {
		return null;
	}

	@Override
	public Ticket updateTicket(Ticket t) {
		// TODO Auto-generated method stub
		return tr.save(t);
	}

	@Override
	public Ticket deleteTicket(Ticket t) {
		// TODO Auto-generated method stub
		return null;
	}

}
