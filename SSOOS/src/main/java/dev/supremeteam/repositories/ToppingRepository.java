package dev.supremeteam.repositories;


import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.supremeteam.entities.Topping;

@Component
@Repository
public interface ToppingRepository extends CrudRepository<Topping,Integer>{

<<<<<<< HEAD
	Topping findByToppingName(String toppingName);

	List<Topping> findByCostGreaterThan(float cost);

	List<Topping> findByCostEquals(float cost);

	List<Topping> findByCostLessThan(float cost);
	
	List<Topping> findByCostBetween(float min,float max);
=======
	public Topping findByToppingName(String toppingName);

	public List<Topping> findByCostLessThan(float price);
	public List<Topping> findByCostGreaterThan(float price);


	Topping findByToppingName(String toppingName);
	  List<Topping>     findByCostGreaterThan(float cost);
	  List<Topping>     findByCostEquals(float cost);
	  List<Topping>     findByCostLessThan(float cost);
>>>>>>> 286e215533febcc385e3884766c66feaa8b17f88
}
