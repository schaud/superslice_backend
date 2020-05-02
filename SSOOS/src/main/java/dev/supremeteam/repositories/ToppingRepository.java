package dev.supremeteam.repositories;


import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.supremeteam.entities.Topping;

@Component
@Repository
public interface ToppingRepository extends CrudRepository<Topping,Integer>{

	public Topping findByToppingName(String toppingName);

	public List<Topping> findByCostLessThan(float price);
	public List<Topping> findByCostGreaterThan(float price);


	Topping findByToppingName(String toppingName);
	  List<Topping>     findByCostGreaterThan(float cost);
	  List<Topping>     findByCostEquals(float cost);
	  List<Topping>     findByCostLessThan(float cost);
}
