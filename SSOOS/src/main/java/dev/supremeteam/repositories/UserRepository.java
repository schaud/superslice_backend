package dev.supremeteam.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.supremeteam.entities.User;

@Component
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

	 public User findByUsernameAndPassword(String username,String password);
	

	 public User findByUsername(String name);
	
	
}
