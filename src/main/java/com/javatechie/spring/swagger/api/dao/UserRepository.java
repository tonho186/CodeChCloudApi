package com.javatechie.spring.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.swagger.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
