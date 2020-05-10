package dev.supremeteam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import dev.supremeteam.services.MetricsService;

@SpringBootTest
@ContextConfiguration(classes=dev.supremeteam.app.SsoosApplication.class)
@Transactional
class MetricsServiceTests {

	@Autowired
	MetricsService metServ;
	
	@Test
	void getOrdersByTime() {
		int[] array = metServ.getOrdersByTime();
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	@Test
	void getTop5Toppings() {
		System.out.println(metServ.getTopToppings());
	}
	
	@Test
	void getTop5ToppingsAlt() {
		String[] topNames = metServ.getTopToppingNames();
		int[] topAmounts = metServ.getTopToppingAmounts();
		for (int i = 0; i < 5; i++) {
			System.out.println(topNames[i] + ": " + topAmounts[i]);
		}
	}
	
	@Test
	void getTop3Customers() {
		String[] usernames = metServ.getTopCustomerNames();
		int[] orders = metServ.getTopCustomerOrders();
		for (int i = 0; i < 3; i++) {
			System.out.println(usernames[i] + " orders made: " + orders[i]);
		}
	}
	
	@Test
	void getAverageAndRevenue() {
		System.out.println("Total Revenue: " + metServ.getTotalRevenue());
		System.out.println("Average Cost per Ticket: "  + metServ.getAverageTicketPrice());
	}
}
