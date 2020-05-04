package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.services.EmployeeService;

@SpringBootTest
@ContextConfiguration(classes = dev.supremeteam.app.SsoosApplication.class)
@Transactional
class EmployeeServiceTests {
	
	@Autowired
	EmployeeService employeeServ;

	@Test
	void test() {
		System.out.println(employeeServ.getPendingTickets());
		System.out.println(employeeServ.getIncompleteTickets());
		System.out.println(employeeServ.getCompleteTickets());
	}

}
