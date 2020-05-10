package dev.supremeteam.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.supremeteam.services.MetricsService;

@Component
@Controller
@CrossOrigin("*")
public class MetricsController {
	
	@Autowired
	MetricsService metServ;
	
	@ResponseBody
	@RequestMapping(value="metrics/time",method = RequestMethod.GET)
	public int[] getOrdersByTime() {
		return metServ.getOrdersByTime();
	}
	
	@ResponseBody
	@RequestMapping(value="metrics/toptoppings", method = RequestMethod.GET)
	public Map<String,Integer> getTopFiveToppings(){
		return metServ.getTopToppings();
	}
	
	@ResponseBody
	@RequestMapping(value="metrics/topping/names", method = RequestMethod.GET)
	public String[] getTopToppingNames() {
		return metServ.getTopToppingNames();
	}
	
	@ResponseBody
	@RequestMapping(value="metrics/topping/amounts", method = RequestMethod.GET)
	public int[] getTopToppingAmounts() {
		return metServ.getTopToppingAmounts();
	}
	
	@ResponseBody
	@RequestMapping(value="metrics/customer/names", method = RequestMethod.GET)
	public String[] getTopCustomerNames() {
		return metServ.getTopCustomerNames();
	}
	
	@ResponseBody
	@RequestMapping(value="metrics/customer/orders", method = RequestMethod.GET)
	public int[] getTopCustomerOrders() {
		return metServ.getTopCustomerOrders();
	}
	
	@ResponseBody
	@RequestMapping(value="metrics/earnings/total", method = RequestMethod.GET)
	public int getTotalRevenue() {
		return metServ.getTotalRevenue();
	}
	
	@ResponseBody
	@RequestMapping(value="metrics/earnings/average", method = RequestMethod.GET)
	public int getAverageTicketPrice() {
		return metServ.getAverageTicketPrice();
	}

}
