package dev.supremeteam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.supremeteam.entities.Topping;
import dev.supremeteam.repositories.ToppingRepository;
@Component
@Service
public class ToppingServiceimpl implements ToppingService{
	@Autowired
	ToppingRepository tr;
	
	@Override
	public List<Topping> getSizes() {
		return tr.findByCostGreaterThan(5);
	}

	@Override
	public List<Topping> getVeggies() {
		return tr.findByCostLessThan(2);
	}

	@Override
	public List<Topping> getMeats() {
		return tr.findByCostBetween(2, 5);
	}
	

}
