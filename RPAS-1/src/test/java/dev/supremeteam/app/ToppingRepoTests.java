package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.entities.Topping;
import dev.supremeteam.entities.User;
import dev.supremeteam.repositories.ToppingRepository;

@SpringBootTest
@ContextConfiguration(classes=dev.supremeteam.app.SsoosApplication.class)
@Transactional
class ToppingRepoTests {

	@Autowired
	ToppingRepository tRepo;
	
	@Test
	void getAllToppings() {
		System.out.println(tRepo.findAll());
	}
	
	@Test
	void getToppingById() {
		Topping topping = tRepo.findById(10).get();
		System.out.println(topping);
		System.out.println(topping.getPizzas());
	}
	
	@Test
	void getToppingByName() {
		Topping topping = tRepo.findByToppingName("Onions");
		System.out.println(topping);
	}
  
	@Test
	void getVeggieToppings() {
		List<Topping> toppings = tRepo.findByCostLessThan(2);
		System.out.println(toppings);
	}
  
	@Test
	void getMeatToppings() {
		List<Topping> toppings = tRepo.findByCostGreaterThan(5);
		System.out.println(toppings);
	}

	@Test
	void getAllMeats() {
		List<Topping> topping = tRepo.findByCostGreaterThan(2);
		System.out.println(topping);
	}
	
	@Test
	void getAllNonVeggies() {
		List<Topping> topping = tRepo.findByCostEquals(2);
		System.out.println(topping);
	}
	
	@Test
	void getAllDollarToppings() {
		List<Topping> topping = tRepo.findByCostLessThan(2);
		System.out.println(topping);
	}

}
