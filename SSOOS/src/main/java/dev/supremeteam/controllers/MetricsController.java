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

}
