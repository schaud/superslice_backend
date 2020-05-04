package dev.supremeteam.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.supremeteam.entities.*;
import dev.supremeteam.services.PizzaService;
import dev.supremeteam.services.TicketService;
import dev.supremeteam.services.ToppingService;

@Component
@Controller 
@CrossOrigin("*")
public class PizzaController {
	public static final Ticket ticket = new Ticket();
	public static final String size = new String();
	public static final Set<String> toppingList = new TreeSet<String>();
	@Autowired
	ToppingService ts;
	
	@Autowired
	TicketService tks;
	
	@Autowired
	PizzaService ps;
	
	
	  
	  
	@ResponseBody
	@RequestMapping(value="/getMeatToppings",method=RequestMethod.GET)
	public List<Topping> getMeats() {
		return ts.getMeats();
	}
	@ResponseBody
	@RequestMapping(value="/getVeggieToppings",method=RequestMethod.GET)
	public List<Topping> getVeggies() {
		return ts.getVeggies();
	}
	@ResponseBody
	@RequestMapping(value="/getSizes",method=RequestMethod.GET)
	public List<Topping> getSizes() {
		return ts.getSizes();
	}
	@ResponseBody
	@RequestMapping(value ="/makeOrder", method = RequestMethod.POST)
	public Ticket createTicket(@RequestBody OrderForm orderForm) {
		return tks.createTicket(orderForm);
	}

	@ResponseBody
	@RequestMapping(value = "/pizza", method = RequestMethod.GET)
	public Pizza query(@RequestParam String toppings) {
		// String parameter = toppings.toString();
		Pizza pizza = new Pizza();
		switch (toppings) {

		case "WhitePizza":
			pizza = ps.whitePizza(ticket, size); break;
		case "PlainPizza":
			pizza = ps.plainPizza(ticket, size); break;
		case "VeggiePizza":
			pizza = ps.veggiePizza(ticket, size); break;
		case "MeatLoversPizza":
			pizza = ps.meatLoversPizza(ticket, size); break;
		case "HawaiianPizza":
			pizza = ps.hawaiianPizza(ticket, size); break;
		case "MediterraneanPizza":
			pizza = ps.mediterraneanPizza(ticket, size); break;
		case "FourCheesePizza":
			pizza = ps.fourCheesePizza(ticket, size); break;
		case "AlfredoPizza":
			pizza = ps.alfredoPizza(ticket, size); break;
		case "ItalianPizza":
			pizza = ps.italianPizza(ticket, size); break;
		case "SupremePizza":
			pizza = ps.supremePizza(ticket, size); break;
		case "PepperoniPizza":
			pizza = ps.pepperoniPizza(ticket, size); break;
		case "MushroomPizza":
			pizza = ps.mushroomPizza(ticket, size); break;
		case "ChickenPizza":
			pizza = ps.chickenPizza(ticket, size); break;
		case "AnchoviePizza":
			pizza = ps.anchoviePizza(ticket, size); break;
		case "SpinachPizza":
			pizza = ps.spinachPizza(ticket, size); break;
		case "BaconPizza":
			pizza = ps.baconPizza(ticket, size); break;
		case "CauliflowerPizza":
			pizza = ps.cauliflowerPizza(ticket, size); break;
		case "SausagePizza":
			pizza = ps.sausagePizza(ticket, size); break;
		case "EggplantPizza":
			pizza = ps.eggplantPizza(ticket, size); break;
		case "CustomPizza":
			pizza = ps.customPizza(ticket, size, toppingList); break;

		}
//		pizza.setCost(pizza.getCost() + 8);
		return pizza;
	}

}
