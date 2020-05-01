package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.entities.Topping;
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

}
