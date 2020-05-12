package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.Topping;
import dev.supremeteam.repositories.TicketRepository;
import dev.supremeteam.services.ApiService;
@SpringBootTest
@ContextConfiguration(classes=dev.supremeteam.app.SsoosApplication.class)
class ApiServiceTests {
	
	@Autowired
	ApiService apiServ;
	@Autowired
	TicketRepository ticketRepo;

	@Test
	@Commit
	void ticketAPI() {
		Ticket ticket = ticketRepo.findById(90).get();
		
		System.out.println(ticket = apiServ.createTicket(ticket));
		ticket.setStatus("Complete");
		System.out.println(ticket = apiServ.updateTicket(ticket));
		System.out.println(apiServ.getAllTickets());
		System.out.println(apiServ.getTicketById(ticket.getTicketId()));
		System.out.println(apiServ.getUserTickets("jesse01"));
		System.out.println(apiServ.deleteTicket(ticket));
	}
	
	@Test
	void createToppingAPI() {
		Topping topping = new Topping();
		topping.setCost(15);
		topping.setToppingName("Caviar");
		apiServ.createTopping(topping);
	}
	
	@Test
	void updateToppingAPI() {
		Topping topping = apiServ.getToppingByName("Caviar");
		topping.setCost(4);
		apiServ.updateTopping(topping);
	}
	
	@Test
	void restToppingAPI() {
		System.out.println(apiServ.getAllToppings());
		System.out.println(apiServ.getToppingsByPopularity());
		System.out.println(apiServ.deleteTopping(apiServ.getToppingByName("Caviar")));
	}
	
	@Test
	void failedTests() {
		System.out.println(apiServ.getToppingById(999));
	}

}
