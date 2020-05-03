package dev.supremeteam.services;

import java.util.HashSet;
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
	
	@Override
	public Pizza veggiePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(11).get());
		toppings.add(toppingRepo.findById(12).get());
		toppings.add(toppingRepo.findById(17).get());
		toppings.add(toppingRepo.findById(18).get());
		toppings.add(toppingRepo.findById(19).get());
		toppings.add(toppingRepo.findById(13).get());
		pizza.setToppings(toppings);
		
		return pizza;
	}

	@Override
	public Pizza meatLoversPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(22).get());
		toppings.add(toppingRepo.findById(23).get());
		toppings.add(toppingRepo.findById(25).get());
		toppings.add(toppingRepo.findById(28).get());
		toppings.add(toppingRepo.findById(29).get());
		toppings.add(toppingRepo.findById(24).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza hawaiianPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(11).get());
		toppings.add(toppingRepo.findById(21).get());
		toppings.add(toppingRepo.findById(24).get());
		toppings.add(toppingRepo.findById(28).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza customPizza(Ticket ticket, String size, Set<String> toppingList) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);

		Set<Topping> toppings = new HashSet<Topping>();
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

		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza mediterraneanPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(14).get());
		toppings.add(toppingRepo.findById(16).get());
		toppings.add(toppingRepo.findById(33).get());
		toppings.add(toppingRepo.findById(34).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza fourCheesePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(20).get());
		toppings.add(toppingRepo.findById(34).get());
		toppings.add(toppingRepo.findById(35).get());
		toppings.add(toppingRepo.findById(36).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza whitePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(35).get());
		toppings.add(toppingRepo.findById(36).get());
		toppings.add(toppingRepo.findById(37).get());
		toppings.add(toppingRepo.findById(19).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza alfredoPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(17).get());
		toppings.add(toppingRepo.findById(24).get());
		toppings.add(toppingRepo.findById(35).get());
		toppings.add(toppingRepo.findById(37).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza italianPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(16).get());
		toppings.add(toppingRepo.findById(26).get());
		toppings.add(toppingRepo.findById(35).get());
		toppings.add(toppingRepo.findById(36).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza supremePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(10).get());
		toppings.add(toppingRepo.findById(11).get());
		toppings.add(toppingRepo.findById(20).get());
		toppings.add(toppingRepo.findById(29).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza pepperoniPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(29).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza mushroomPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(10).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza chickenPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(24).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza anchoviePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(27).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza spinachPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(33).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza baconPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(23).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza cauliflowerPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(19).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza sausagePizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(22).get());
		pizza.setToppings(toppings);

		return pizza;
	}

	@Override
	public Pizza eggplantPizza(Ticket ticket, String size) {
		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		toppings.add(toppingRepo.findById(18).get());
		pizza.setToppings(toppings);

		return pizza;
	}

}
