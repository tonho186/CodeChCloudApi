package com.javatechie.spring.swagger.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.swagger.api.dao.UserRepository;
import com.javatechie.spring.swagger.api.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public String saveUser(User user) {
		repository.save(user);
		return "book user dwith id " + user.getId();
	}

	public User getUser(int userId) {
		return repository.findOne(userId);
	}

	public List<User> removeUser(int userId) {
		repository.delete(userId);
		return repository.findAll();
	}
}
