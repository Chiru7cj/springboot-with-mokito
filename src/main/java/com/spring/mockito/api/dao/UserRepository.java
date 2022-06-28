package com.spring.mockito.api.dao;

import java.util.List;

import com.spring.mockito.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer>{
	
	List<User> findByAddress(String address);

}
