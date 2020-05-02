package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.entities.Pizza;
import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.Topping;
import dev.supremeteam.repositories.TicketRepository;
import dev.supremeteam.services.PizzaService;

@SpringBootTest
@ContextConfiguration(classes = dev.supremeteam.app.SsoosApplication.class)
@Transactional
class PizzaServiceTests {

	@Autowired
	PizzaService pizzaServ;

	@Autowired
	TicketRepository ticketRepo;

	@Test
//	@Commit
	void veggiePizza() {
		Ticket ticket = ticketRepo.findById(5).get();
		Pizza pizza = pizzaServ.veggiePizza(ticket, "Medium");
		System.out.println(pizza);
		System.out.println(pizza.getToppings());

		float cost = 0;
		for (Topping topping : pizza.getToppings()) {
			cost += topping.getCost();
		}
		System.out.println(cost);
	}

	@Test
	void meatLoversPizza() {
		Ticket ticket = ticketRepo.findById(5).get();
		Pizza pizza = pizzaServ.meatLoversPizza(ticket, "Large");
		System.out.println(pizza);
		System.out.println(pizza.getToppings());

		float cost = 0;
		for (Topping topping : pizza.getToppings()) {
			cost += topping.getCost();
		}
		System.out.println(cost);
	}

	@Test
	void hawaiianPizza() {
		Ticket ticket = ticketRepo.findById(5).get();
		Pizza pizza = pizzaServ.hawaiianPizza(ticket, "Small");
		System.out.println(pizza);
		System.out.println(pizza.getToppings());

		float cost = 0;
		for (Topping topping : pizza.getToppings()) {
			cost += topping.getCost();
		}
		System.out.println(cost);
	}
	
	@Test
	void customPizza() {
		Ticket ticket = ticketRepo.findById(5).get();
		
		Set<String> toppingList = new HashSet<String>();
		toppingList.add("Mushrooms");
		toppingList.add("Onions");
		toppingList.add("Tomatoes");
		toppingList.add("Pineapples");
		toppingList.add("Chicken");
		
		Pizza pizza = pizzaServ.customPizza(ticket, "Medium", toppingList);
		
		System.out.println(pizza);
		System.out.println(pizza.getToppings());

		float cost = 0;
		for (Topping topping : pizza.getToppings()) {
			cost += topping.getCost();
		}
		System.out.println(cost);
	}
	
	@Test
	void plainPizza() {
		Ticket ticket = ticketRepo.findById(5).get();
		Pizza pizza = pizzaServ.plainPizza(ticket, "Medium");
		System.out.println(pizza);
		System.out.println(pizza.getToppings());

		float cost = 0;
		for (Topping topping : pizza.getToppings()) {
			cost += topping.getCost();
		}
		System.out.println(cost);
	}
	
	@Test
	void mediterraneanPizza() {
		Ticket ticket = ticketRepo.findById(5).get();
		Pizza pizza = pizzaServ.mediterraneanPizza(ticket, "Medium");
		System.out.println(pizza);
		System.out.println(pizza.getToppings());

		float cost = 0;
		for (Topping topping : pizza.getToppings()) {
			cost += topping.getCost();
		}
		System.out.println(cost);
	}
	
	@Test
	void fourCheesePizza() {
		Ticket ticket = ticketRepo.findById(5).get();
		Pizza pizza = pizzaServ.fourCheesePizza(ticket, "Large");
		System.out.println(pizza);
		System.out.println(pizza.getToppings());

		float cost = 0;
		for (Topping topping : pizza.getToppings()) {
			cost += topping.getCost();
		}
		System.out.println(cost);
	}
	
	@Test
	void whitePizza() {
		Ticket ticket = ticketRepo.findById(5).get();
		Pizza pizza = pizzaServ.whitePizza(ticket, "Large");
		System.out.println(pizza);
		System.out.println(pizza.getToppings());

		float cost = 0;
		for (Topping topping : pizza.getToppings()) {
			cost += topping.getCost();
		}
		System.out.println(cost);
	}

}
