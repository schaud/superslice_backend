package dev.supremeteam.services;

import dev.supremeteam.entities.User;

public interface UserService {
	User createUser(User u);
	
	User loginUser(String username, String password);
}
