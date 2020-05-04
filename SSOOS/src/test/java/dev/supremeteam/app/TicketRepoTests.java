package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Time;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.repositories.TicketRepository;
import dev.supremeteam.repositories.UserRepository;

@SpringBootTest
@ContextConfiguration(classes=dev.supremeteam.app.SsoosApplication.class)
@Transactional
class TicketRepoTests {

	@Autowired
	TicketRepository tRepo;
	
	@Autowired
	UserRepository uRepo;
	
	@Test
	void createTicket() {
		Ticket ticket = new Ticket();
		ticket.setNote("Please leave my pizza in the middle of the street.");
		ticket.setUser(uRepo.findById(7).get());
		ticket.setStatus("Pending");
		long now = System.currentTimeMillis();
		Time time = new Time(now);
		ticket.setPlacementTime(time);
		ticket.setTicketId(0);
		System.out.println(tRepo.save(ticket));
	}
	
	@Test
	void getAllTickets() {
		System.out.println(tRepo.findAll());
	}
	
	@Test
	void getTicketById() {
		Ticket ticket = tRepo.findById(5).get();
		System.out.println(ticket);
		System.out.println(ticket.getUser());
		System.out.println(ticket.getPizzas());
	}
	
//	@Test
//	void getTicketByUser() {
//		Ticket ticket = tRepo.TicketByUsername("raymond02");
//		System.out.println(ticket);
//		
//	}

}
