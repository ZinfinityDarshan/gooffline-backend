package app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entities.User;
import app.repository.UserRepository;

@Service
public class UserService {

	@Autowired private UserRepository userrepo;
	
	public User addUser(User u) {
		return userrepo.insert(u);
	}
	
	public List<User> getAllUsers(){
		return userrepo.findAll();
	}
	
	public User getUserById(String id) {
		return userrepo.findById(id).get();
	}
	
	public User getUserByUserName(String username) {
		var userOptional = userrepo.findUserByUsername(username);
		User user = null;
		if(userOptional.isPresent()){
			user = userOptional.get();
		}else {
			user = null;
		}
		return user;
	}
}
