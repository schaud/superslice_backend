package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.services.UserService;

@SpringBootTest
@ContextConfiguration(classes=dev.supremeteam.app.SsoosApplication.class)
//@Transactional
class UserServiceTests {

	@Autowired
	UserService userServ;
	
	@Test
//	@Commit
	void registerUser() {
		System.out.println(userServ.registerUser("Cloud95", "password"));
	}

}
