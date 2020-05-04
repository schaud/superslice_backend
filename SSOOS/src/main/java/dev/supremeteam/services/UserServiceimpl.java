package dev.supremeteam.services;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.UnexpectedRollbackException;

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
	@Autowired
	UserRoleRepository urr;
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

	@Override
	public User registerUser(String username, String password) {
		try {
			User user = new User();
			user.setPassword(password);
			user.setUserId(0);
			user.setUsername(username);
			user.setUserRole(urr.findById(2).get());
			return ur.save(user);
		} catch (Exception e) {
			User user = new User();
			return user;
		}
	}
	

}
