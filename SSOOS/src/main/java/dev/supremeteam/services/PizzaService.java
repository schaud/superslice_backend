package dev.supremeteam.services;

import java.util.Set;

import dev.supremeteam.entities.Pizza;
import dev.supremeteam.entities.PizzaForm;
import dev.supremeteam.entities.Ticket;

public interface PizzaService {
	
	void orderPizza(Ticket ticket, PizzaForm pizzaForm);
	
	Pizza plainPizza(Ticket ticket, String size);
	
	Pizza veggiePizza(Ticket ticket, String size);
	Pizza meatLoversPizza(Ticket ticket, String size);
	Pizza hawaiianPizza(Ticket ticket, String size);
	Pizza mediterraneanPizza(Ticket ticket, String size);
	Pizza fourCheesePizza(Ticket ticket, String size);
	Pizza whitePizza(Ticket ticket, String size);
	Pizza alfredoPizza(Ticket ticket, String size);
	Pizza italianPizza(Ticket ticket, String size);
	Pizza supremePizza(Ticket ticket, String size);
	
	Pizza pepperoniPizza(Ticket ticket, String size);
	Pizza mushroomPizza(Ticket ticket, String size);
	Pizza chickenPizza(Ticket ticket, String size);
	Pizza anchoviePizza(Ticket ticket, String size);
	Pizza spinachPizza(Ticket ticket, String size);
	Pizza baconPizza(Ticket ticket, String size);
	Pizza cauliflowerPizza(Ticket ticket, String size);
	Pizza sausagePizza(Ticket ticket, String size);
	Pizza eggplantPizza(Ticket ticket, String size);
	
	Pizza customPizza(Ticket ticket, String size, Set<String> toppingList);

}
