package dev.supremeteam.services;

import java.util.Map;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.Topping;
import dev.supremeteam.entities.User;

public interface MetricsService {
	
	int[] getOrdersByTime();
	
	Map<String,Integer> getTopToppings();
	String[] getTopToppingNames();
	int[] getTopToppingAmounts();
	
	int getTotalRevenue();
	
	int getAverageTicketPrice();
	
	String[] getTopCustomerNames();
	int[] getTopCustomerOrders();

}
