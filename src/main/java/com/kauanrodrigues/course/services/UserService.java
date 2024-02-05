package com.kauanrodrigues.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kauanrodrigues.course.entities.User;
import com.kauanrodrigues.course.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		return repository.findById(id).get();
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
}
