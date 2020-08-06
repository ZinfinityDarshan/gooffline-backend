package app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entities.User;
import app.services.UserService;

@CrossOrigin(allowedHeaders="*")
@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired private UserService userservice;
	

	@PostMapping("add")
	public User addUser(@RequestBody User user) {
		return userservice.addUser(user);
	}
	
	@GetMapping("getAll")
	public List<User> getAll(){
		return userservice.getAllUsers();
	}
}
