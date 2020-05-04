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
		switch (toppings) {

		case "WhitePizza":
			return ps.whitePizza(ticket, size);
		case "PlainPizza":
			return ps.plainPizza(ticket, size);
		case "VeggiePizza":
			return ps.veggiePizza(ticket, size);
		case "MeatLoversPizza":
			return ps.meatLoversPizza(ticket, size);
		case "HawaiianPizza":
			return ps.hawaiianPizza(ticket, size);
		case "MediterraneanPizza":
			return ps.mediterraneanPizza(ticket, size);
		case "FourCheesePizza":
			return ps.fourCheesePizza(ticket, size);
		case "AlfredoPizza":
			return ps.alfredoPizza(ticket, size);
		case "ItalianPizza":
			return ps.italianPizza(ticket, size);
		case "SupremePizza":
			return ps.supremePizza(ticket, size);
		case "PepperoniPizza":
			return ps.pepperoniPizza(ticket, size);
		case "MushroomPizza":
			return ps.mushroomPizza(ticket, size);
		case "ChickenPizza":
			return ps.chickenPizza(ticket, size);
		case "AnchoviePizza":
			return ps.anchoviePizza(ticket, size);
		case "SpinachPizza":
			return ps.spinachPizza(ticket, size);
		case "BaconPizza":
			return ps.baconPizza(ticket, size);
		case "CauliflowerPizza":
			return ps.cauliflowerPizza(ticket, size);
		case "SausagePizza":
			return ps.sausagePizza(ticket, size);
		case "EggplantPizza":
			return ps.eggplantPizza(ticket, size);
		case "CustomPizza":
			return ps.customPizza(ticket, size, toppingList);

		}
		return null;
	}

}
