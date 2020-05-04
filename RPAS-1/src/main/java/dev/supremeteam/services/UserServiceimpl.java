package dev.supremeteam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.User;
import dev.supremeteam.repositories.*;
@Component
@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserRepository ur;
	@Autowired
	TicketRepository tr;
	@Override
	public User createUser(User u) {
		return ur.save(u);
	}

	@Override
	public User loginUser(String username, String password) {
		
		return ur.findByUsernameAndPassword(username, password);
	}

	@Override
	public Ticket createTicket(Ticket t) {
		
		return tr.save(t);
	}
	

}
