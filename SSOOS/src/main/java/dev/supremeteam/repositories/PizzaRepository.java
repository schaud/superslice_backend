package dev.supremeteam.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.supremeteam.entities.Pizza;

@Component
@Repository
public interface PizzaRepository extends CrudRepository<Pizza,Integer>{

}
