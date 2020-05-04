package dev.supremeteam.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.supremeteam.entities.*;
import dev.supremeteam.services.ToppingService;

@Component
@Controller 
@CrossOrigin("*")
public class PizzaController {
	@Autowired
	ToppingService ts;
	
	@ResponseBody
	@RequestMapping(value="/getMeatToppings",method=RequestMethod.GET)
	public List<Topping> getMeats() {
		return ts.getMeats();
	}
	@ResponseBody
	@RequestMapping(value="/getVeggieToppings",method=RequestMethod.GET)
	public List<Topping> getVeggies() {
		return ts.getVeggies();
	}
	@ResponseBody
	@RequestMapping(value="/getSizes",method=RequestMethod.GET)
	public List<Topping> getSizes() {
		return ts.getSizes();
	}
}
