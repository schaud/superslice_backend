package dev.supremeteam.app;


import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.entities.UserRole;
import dev.supremeteam.repositories.UserRoleRepository;

@SpringBootTest
@ContextConfiguration(classes=dev.supremeteam.app.SsoosApplication.class)
@Transactional
class UserRoleRepoTests {
	
	@Autowired
	UserRoleRepository urRep;

	@Test
	void createUserRole() {
		UserRole role = new UserRole();
		role.setRoleId(0);
		role.setRoleTitle("Manager");
		System.out.println(urRep.save(role));
	}
	
	@Test
	void getAllUserRoles() {
		List<UserRole> userRoles = (List<UserRole>) urRep.findAll();
		System.out.println(userRoles);
	}
	
	@Test
	void getUserRoleById() {
		UserRole role = urRep.findById(2).get();
		System.out.println(role);
		System.out.println(role.getUsers());
	}
	
	@Test
	void updateUserRole() {
		UserRole role = urRep.findById(2).get();
		role.setRoleTitle("Client");
		System.out.println(urRep.save(role));
	}
	
	@Test
	void deleteUserRole() {
		UserRole role = urRep.findById(2).get();
		urRep.delete(role);
	}
	

}
