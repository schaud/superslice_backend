package dev.supremeteam.services;

import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.supremeteam.entities.OrderForm;
import dev.supremeteam.entities.PizzaForm;
import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.User;
import dev.supremeteam.repositories.TicketRepository;
import dev.supremeteam.repositories.UserRepository;

@Component
@Service
public class TicketServiceimpl implements TicketService{

	@Autowired
	UserRepository userRepo;
	@Autowired
	TicketRepository ticketRepo;
	@Autowired
	PizzaService pizzaServ;
	
	@Override
	public Ticket createTicket(OrderForm orderForm) {
		
		Ticket ticket = new Ticket();
		
		ticket.setNote(orderForm.getNote());
		
		ticket.setStatus("Pending");
		
		ticket.setTicketId(0);
		
		long now = System.currentTimeMillis();
		Time time = new Time(now);
		ticket.setPlacementTime(time);
		
		ticket.setUser(userRepo.findByUsername(orderForm.getUsername()));
		ticket = ticketRepo.save(ticket);
		for (PizzaForm pizzaForm : orderForm.getPizzaForms()) {
			pizzaServ.orderPizza(ticket, pizzaForm);
		}
		return ticket;
		
		
		
		
	}

}
