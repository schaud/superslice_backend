package dev.supremeteam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.Topping;
import dev.supremeteam.services.ApiService;

@Component
@Controller 
@CrossOrigin("*")
public class ApiController {
	
	@Autowired
	ApiService apiServ;

	@ResponseBody
	@RequestMapping(value="api/ticket",method = RequestMethod.POST)
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return apiServ.createTicket(ticket);
	}
	@ResponseBody
	@RequestMapping(value="api/ticket/id/{id}",method = RequestMethod.GET)
	public Ticket getTicketById(@PathVariable int id) {
		return apiServ.getTicketById(id);
	}
	@ResponseBody
	@RequestMapping(value="api/ticket/all",method = RequestMethod.GET)
	public List<Ticket> getAllTickets() {
		return apiServ.getAllTickets();
	}
	@ResponseBody
	@RequestMapping(value="api/ticket/username/{username}",method = RequestMethod.GET)
	public List<Ticket> getTicketByUsername(@PathVariable String username) {
		return apiServ.getUserTickets(username);
	}
	@ResponseBody
	@RequestMapping(value="api/ticket",method = RequestMethod.PUT)
	public Ticket updateTicket(@RequestBody Ticket ticket) {
		return apiServ.updateTicket(ticket);
	}
	@ResponseBody
	@RequestMapping(value="api/ticket",method = RequestMethod.DELETE)
	public boolean deleteTicket(@RequestBody Ticket ticket) {
		return apiServ.deleteTicket(ticket);
	}
	@ResponseBody
	@RequestMapping(value="api/topping",method = RequestMethod.POST)
	public Topping createTopping(@RequestParam String name, @RequestParam float cost) {
		Topping topping = new Topping();
		topping.setToppingName(name);
		topping.setCost(cost);
		return apiServ.createTopping(topping);
	}
	@ResponseBody
	@RequestMapping(value="api/topping/id/{id}",method = RequestMethod.GET)
	public Topping getToppingById(@PathVariable int id) {
		return apiServ.getToppingById(id);
	}
	@ResponseBody
	@RequestMapping(value="api/topping/name/{name}",method = RequestMethod.GET)
	public Topping getToppingByName(@PathVariable String name) {
		return apiServ.getToppingByName(name);
	}
	@ResponseBody
	@RequestMapping(value="api/topping/all",method = RequestMethod.GET)
	public List<Topping> getAllToppings(@RequestParam String order) {
		switch (order) {
		case "id": return apiServ.getAllToppings();
		case "popularity": return apiServ.getToppingsByPopularity();
		default: return apiServ.getAllToppings();
		}
	}
	@ResponseBody
	@RequestMapping(value="api/topping",method = RequestMethod.PUT)
	public Topping updateTopping(@RequestBody Topping topping) {
		return apiServ.updateTopping(topping);
	}
	@ResponseBody
	@RequestMapping(value="api/topping",method = RequestMethod.DELETE)
	public boolean deleteTopping(@RequestBody Topping topping) {
		return apiServ.deleteTopping(topping);
	}
}
