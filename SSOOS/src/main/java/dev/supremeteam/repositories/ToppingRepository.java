package dev.supremeteam.repositories;


import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.supremeteam.entities.Topping;

@Component
@Repository
public interface ToppingRepository extends CrudRepository<Topping,Integer>{

	Topping findByToppingName(String toppingName);

	List<Topping> findByCostGreaterThan(float cost);

	List<Topping> findByCostEquals(float cost);

	List<Topping> findByCostLessThan(float cost);
	
	List<Topping> findByCostBetween(float min,float max);
}
