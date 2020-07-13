package com.javatechie.spring.swagger.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.swagger.api.model.User;
import com.javatechie.spring.swagger.api.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/users")
@Api(value = "User Service")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/createUsers")
	@ApiOperation(value = "store user api")
	public String saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@ApiOperation(value = "search user api")
	@GetMapping("/getusersById/{userId}")
	public User getUser(@PathVariable int userId) {
		return service.getUser(userId);
	}

	@DeleteMapping("/deleteUsersById/{userId}")
	public List<User> deleteUser(@PathVariable int userId) {
		return service.removeUser(userId);

	}
}
