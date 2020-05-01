package dev.supremeteam.repositories;

import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.supremeteam.entities.Topping;

@Component
@Repository
public interface ToppingRepository extends CrudRepository<Topping,Integer>{
	public List<Topping> findByCostLessThan(float price);
	public List<Topping> findByCostGreaterThan(float price);
}
