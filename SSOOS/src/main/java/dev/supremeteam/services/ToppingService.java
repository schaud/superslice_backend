package dev.supremeteam.services;

import java.util.List;

import dev.supremeteam.entities.Topping;

public interface ToppingService {
	List<Topping> getSizes();
	
	List<Topping> getVeggies();
	
	List<Topping> getMeats();
	
}
