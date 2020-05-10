package dev.supremeteam.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.supremeteam.entities.User;

@Component
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

	User findByUsernameAndPassword(String username,String password);
	User findByUsername(String name);
	@Query("SELECT u FROM User u LEFT JOIN u.tickets t GROUP BY u ORDER BY count(t) DESC")
	List<User> findTopUsers();
	
}
