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

import dev.supremeteam.entities.OrderForm;
import dev.supremeteam.entities.PizzaForm;
import dev.supremeteam.services.TicketService;

@SpringBootTest
@ContextConfiguration(classes = dev.supremeteam.app.SsoosApplication.class)
@Transactional
class TicketServiceTests {

	@Autowired
	TicketService ticketServ;
	
//	@Test
//	@Commit
//	void test() {
//		OrderForm form = new OrderForm();
//		form.setNote("will i have 3 pizzas?");
//		form.setUsername("raymond02");
//		
//		PizzaForm form1 = new PizzaForm();
//		form1.setSize("Small");
//		form1.setType("PlainPizza");
//		
//		PizzaForm form2 = new PizzaForm();
//		form2.setType("VeggiePizza");
//		form2.setSize("Medium");
//		
//		PizzaForm form3 = new PizzaForm();
//		form3.setSize("Large");
//		form3.setType("CustomPizza");
//		Set<String> toppings = new HashSet<String>();
//		toppings.add("Onions");
//		toppings.add("Tomatoes");
//		toppings.add("Ricotta Cheese");
//		toppings.add("Chicken");
//		form3.setToppingNames(toppings);
//		
//		Set<PizzaForm> pizzaForms = new HashSet<PizzaForm>();
//		pizzaForms.add(form1);
//		pizzaForms.add(form2);
//		pizzaForms.add(form3);
//		
//		form.setPizzaForms(pizzaForms);
//		System.out.println(form);
//	//	ticketServ.createTicket(form);
//		//System.out.println();
//	}

}
