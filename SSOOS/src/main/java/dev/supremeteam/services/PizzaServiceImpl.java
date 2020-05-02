package dev.supremeteam.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.supremeteam.entities.Pizza;
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
		
		return pizzaRepo.save(pizza);
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

		return pizzaRepo.save(pizza);
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

		return pizzaRepo.save(pizza);
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

		return pizzaRepo.save(pizza);
	}

	@Override
	public Pizza plainPizza(Ticket ticket, String size) {

		Pizza pizza = new Pizza();
		pizza.setTicket(ticket);
		pizza.setPizzaId(0);

		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(toppingRepo.findByToppingName(size));
		pizza.setToppings(toppings);

		return pizzaRepo.save(pizza);
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

		return pizzaRepo.save(pizza);
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

		return pizzaRepo.save(pizza);
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

		return pizzaRepo.save(pizza);
	}

}
