package dev.supremeteam.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.supremeteam.entities.Pizza;
import dev.supremeteam.entities.PizzaForm;
import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.Topping;
import dev.supremeteam.repositories.PizzaRepository;
import dev.supremeteam.repositories.ToppingRepository;

@Component
@Service
public class PizzaServiceImpl implements PizzaService {

	@Autowired
	ToppingRepository toppingRepo;
	
	@Autowired
	PizzaRepository pizzaRepo;

	@Override
	public void orderPizza(Ticket ticket, PizzaForm pizzaForm) {
		for (int i = 0; i < pizzaForm.getQuantity(); i++) {
			switch (pizzaForm.getType()) {
			case "VeggiePizza": pizzaRepo.save(veggiePizza(ticket, pizzaForm.getSize())); break;
			case "MeatLoversPizza": pizzaRepo.save(meatLoversPizza(ticket, pizzaForm.getSize())); break;
			case "HawaiianPizza": pizzaRepo.save(hawaiianPizza(ticket, pizzaForm.getSize())); break;
			case "MediterraneanPizza": pizzaRepo.save(mediterraneanPizza(ticket, pizzaForm.getSize())); break;
			case "FourCheesePizza": pizzaRepo.save(fourCheesePizza(ticket, pizzaForm.getSize())); break;
			case "WhitePizza": pizzaRepo.save(whitePizza(ticket, pizzaForm.getSize())); break;
			case "AlfredoPizza": pizzaRepo.save(alfredoPizza(ticket, pizzaForm.getSize())); break;
			case "ItalianPizza": pizzaRepo.save(italianPizza(ticket, pizzaForm.getSize())); break;
			case "SupremePizza": pizzaRepo.save(supremePizza(ticket, pizzaForm.getSize())); break;
			case "PepperoniPizza": pizzaRepo.save(pepperoniPizza(ticket, pizzaForm.getSize())); break;
			case "MushroomPizza": pizzaRepo.save(mushroomPizza(ticket, pizzaForm.getSize())); break;
			case "ChickenPizza": pizzaRepo.save(chickenPizza(ticket, pizzaForm.getSize())); break;
			case "AnchoviePizza": pizzaRepo.save(anchoviePizza(ticket, pizzaForm.getSize())); break;
			case "SpinachPizza": pizzaRepo.save(spinachPizza(ticket, pizzaForm.getSize())); break;
			case "BaconPizza": pizzaRepo.save(baconPizza(ticket, pizzaForm.getSize())); break;
			case "CauliflowerPizza": pizzaRepo.save(cauliflowerPizza(ticket, pizzaForm.getSize())); break;
			case "SausagePizza": pizzaRepo.save(sausagePizza(ticket, pizzaForm.getSize())); break;
			case "EggplantPizza": pizzaRepo.save(eggplantPizza(ticket, pizzaForm.getSize())); break;
			case "CustomPizza": pizzaRepo.save(customPizza(ticket, pizzaForm.getSize(), pizzaForm.getToppingNames())); break;
			case "PlainPizza": pizzaRepo.save(plainPizza(ticket, pizzaForm.getSize())); break;
			}
		}
	}
	
	@Override
	public Pizza veggiePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("VeggiePizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Onions"));
		toppings.add(toppingRepo.findByToppingName("Green Peppers"));
		toppings.add(toppingRepo.findByToppingName("Red Peppers"));
		toppings.add(toppingRepo.findByToppingName("Broccoli"));
		toppings.add(toppingRepo.findByToppingName("Roasted Eggplant"));
		toppings.add(toppingRepo.findByToppingName("Roasted Cauliflower"));
		pizza.setToppings(toppings);
		
		return pizza;
	}

	@Override
	public Pizza meatLoversPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("MeatLoversPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Sausage"));
		toppings.add(toppingRepo.findByToppingName("Bacon"));
		toppings.add(toppingRepo.findByToppingName("Chicken"));
		toppings.add(toppingRepo.findByToppingName("Meatballs"));
		toppings.add(toppingRepo.findByToppingName("Ham"));
		toppings.add(toppingRepo.findByToppingName("Pepperoni"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza hawaiianPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("HawaiianPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Onions"));
		toppings.add(toppingRepo.findByToppingName("Pineapples"));
		toppings.add(toppingRepo.findByToppingName("Chicken"));
		toppings.add(toppingRepo.findByToppingName("Ham"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza customPizza(Ticket ticket, String size, List<String> toppingList) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("CustomPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		for (String toppingName : toppingList) {
			toppings.add(toppingRepo.findByToppingName(toppingName));
		}

		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza plainPizza(Ticket ticket, String size) {

		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("PlainPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza mediterraneanPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("MediterraneanPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Black Olives"));
		toppings.add(toppingRepo.findByToppingName("Tomatoes"));
		toppings.add(toppingRepo.findByToppingName("Spinach"));
		toppings.add(toppingRepo.findByToppingName("Feta Cheese"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza fourCheesePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("FourCheesePizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Extra Cheese"));
		toppings.add(toppingRepo.findByToppingName("Feta Cheese"));
		toppings.add(toppingRepo.findByToppingName("Parmesan Cheese"));
		toppings.add(toppingRepo.findByToppingName("Ricotta Cheese"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza whitePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("WhitePizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Roasted Cauliflower"));
		toppings.add(toppingRepo.findByToppingName("Parmesan Cheese"));
		toppings.add(toppingRepo.findByToppingName("Ricotta Cheese"));
		toppings.add(toppingRepo.findByToppingName("White Sauce"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza alfredoPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("AlfredoPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Broccoli"));
		toppings.add(toppingRepo.findByToppingName("Chicken"));
		toppings.add(toppingRepo.findByToppingName("Parmesan Cheese"));
		toppings.add(toppingRepo.findByToppingName("White Sauce"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza italianPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("ItalianPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Tomatoes"));
		toppings.add(toppingRepo.findByToppingName("Proscuitto"));
		toppings.add(toppingRepo.findByToppingName("Parmesan Cheese"));
		toppings.add(toppingRepo.findByToppingName("Ricotta Cheese"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza supremePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("SupremePizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Mushrooms"));
		toppings.add(toppingRepo.findByToppingName("Onions"));
		toppings.add(toppingRepo.findByToppingName("Extra Cheese"));
		toppings.add(toppingRepo.findByToppingName("Pepperoni"));

		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza pepperoniPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("PepperoniPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Pepperoni"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza mushroomPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("MushroomPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Mushrooms"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza chickenPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("ChickenPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Chicken"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza anchoviePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("AnchoviePizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Anchovies"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza spinachPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("SpinachPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Spinach"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza baconPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("BaconPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Bacon"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza cauliflowerPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("CauliflowerPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Roasted Cauliflower"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza sausagePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("SausagePizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Sausage"));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza eggplantPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		pizza.setType("EggplantPizza");
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findByToppingName("Roasted Eggplant"));
		pizza.setToppings(toppings);

		return pizza;
	}

}
