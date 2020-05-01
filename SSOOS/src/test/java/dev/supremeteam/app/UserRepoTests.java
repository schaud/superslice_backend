package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.entities.User;
import dev.supremeteam.repositories.UserRepository;
import dev.supremeteam.repositories.UserRoleRepository;

@SpringBootTest
@ContextConfiguration(classes=dev.supremeteam.app.SsoosApplication.class)
@Transactional
class UserRepoTests {
	
	@Autowired
	UserRepository uRepo;
	
	@Autowired
	UserRoleRepository urRepo;

	@Test
	void createUser() {
		User user = new User();
		user.setPassword("password9");
		user.setUserId(0);
		user.setUsername("ssj4040xXx");
		user.setUserRole(urRepo.findById(1).get());
		System.out.println(uRepo.save(user));
	}
	
	@Test
	void getAllUsers() {
		System.out.println(uRepo.findAll());
	}
	
	@Test
	void getUserById() {
		User user = uRepo.findById(6).get();
		System.out.println(user);
		System.out.println(user.getUserRole());
		System.out.println(user.getTickets());
	}
	@Test
	void getUserByuspw() {
		User user = uRepo.findByUsernameAndPassword("schaud24", "cpassword");
		System.out.println(user);
		//System.out.println(user.getUserRole());
		//System.out.println(user.getTickets());
	}

	
	@Test
	void updateUser() {
		User user = uRepo.findById(1).get();
		user.setPassword("nomorepassword");
		System.out.println(uRepo.save(user));
	}
	
	@Test
	void deleteUser() {
		User user = uRepo.findById(1).get();
		uRepo.delete(user);
	}

}
