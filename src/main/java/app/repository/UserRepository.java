package app.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import app.entities.User;

public interface UserRepository extends MongoRepository<User, String>{

	@Query("{'username': ?0}")
	public Optional<User> findUserByUsername(String username);
}
