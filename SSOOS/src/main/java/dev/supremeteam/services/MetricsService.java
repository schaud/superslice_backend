package dev.supremeteam.services;

import java.util.Map;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.Topping;
import dev.supremeteam.entities.User;

public interface MetricsService {
	
	int[] getOrdersByTime();
	Map<String,Integer> getTopToppings();
	Map<User,Integer> getTopCustomers();
	int getTotalRevenue();
	int getAverageTicketPrice();

}
