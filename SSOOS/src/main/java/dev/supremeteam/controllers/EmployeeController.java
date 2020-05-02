package dev.supremeteam.controllers;

import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.server.ResponseStatusException;

import dev.supremeteam.entities.*;
import dev.supremeteam.services.EmployeeService;

@Component
@Controller 
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	@ResponseBody
	@RequestMapping(value="/updateTicket",method=RequestMethod.PUT)
	public Ticket createTicket(@RequestBody Ticket t) {
		return es.updateTicket(t);
	}
	@ResponseBody
	@RequestMapping(value="/getUserTickets",method=RequestMethod.GET)
	public Set<Ticket> getUserTickets(@RequestBody User u) {
		return es.getTicketByUser(u);
	}
	@ResponseBody
	@RequestMapping(value="/ticket/{id}", method=RequestMethod.GET)
	public Ticket getTicketById(@PathVariable int id) {
	try {
	return es.getTicketById(id);}
	catch(NoSuchElementException e) {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Could not find ticket");
	}
	}
}
