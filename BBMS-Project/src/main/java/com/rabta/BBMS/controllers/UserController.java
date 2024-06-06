package com.rabta.BBMS.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabta.BBMS.model.User;
import com.rabta.BBMS.services.UserServicesImpl;



@RestController
public class UserController {
	
	@Autowired 
	private UserServicesImpl userService ;
	
	
	@PostMapping(path = "user")
	void addUser (@RequestBody User user) {
		userService.addUser(user);
		}
	
	
    //@Secured("ADMIN") // Autoriser uniquement les utilisateurs avec le rôle "ROLE_USER"
	@GetMapping(path = "users")
	List<User> getAllUser() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	User getUserById(@PathVariable Long id ) {
		return userService.getUserById(id);
	}
	
	@DeleteMapping("/remove/{id}")
	void deleteUser (@PathVariable Long id) {
		userService.deleteUser(id);
		}

}

