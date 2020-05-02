package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.entities.Pizza;
import dev.supremeteam.repositories.PizzaRepository;
import dev.supremeteam.repositories.TicketRepository;

@SpringBootTest
@ContextConfiguration(classes=dev.supremeteam.app.SsoosApplication.class)
@Transactional
class PizzaRepoTests {

	@Autowired
	PizzaRepository pRepo;
	
	@Autowired
	TicketRepository tRepo;
	
	@Test
	void createPizza() {
		Pizza pizza = new Pizza();
		pizza.setPizzaId(0);
		pizza.setTicket(tRepo.findById(8).get());
		System.out.println(pRepo.save(pizza));
	}
	
	@Test
	void getAllPizzas() {
		System.out.println(tRepo.findAll());
	}
	
	@Test
	void getPizzaById() {
		Pizza pizza = pRepo.findById(4).get();
		System.out.println(pizza);
		System.out.println(pizza.getTicket());
		System.out.println(pizza.getToppings());
	}

}
