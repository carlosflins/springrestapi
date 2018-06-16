package com.carlosflins.springrestapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carlosflins.springrestapi.model.User;

@RestController
public class UserController {

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User(1, "Carlos"));
		users.add(new User(2, "Fabiano"));
		users.add(new User(3, "Henrique"));
		users.add(new User(4, "Victor"));
		users.add(new User(5, "Hermes"));
		
		return users;
	}
}
