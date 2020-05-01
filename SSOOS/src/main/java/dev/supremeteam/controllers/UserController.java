package dev.supremeteam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.supremeteam.entities.User;
import dev.supremeteam.services.UserService;
@Component
@Controller 
@CrossOrigin("*")
public class UserController {
	@Autowired
	UserService us;
	
	@ResponseBody
	@RequestMapping(value="/query/user",method=RequestMethod.GET)
	public User login(@RequestParam String username,@RequestParam String password) {
		return us.loginUser(username, password);
	}
	@ResponseBody
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public User createAssociate(@RequestBody User u) {
		return us.createUser(u);
	}
	
}