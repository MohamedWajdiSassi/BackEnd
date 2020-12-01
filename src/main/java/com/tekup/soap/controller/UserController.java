package com.tekup.soap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.soap.entities.User;
import com.tekup.soap.service.UserService;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService ;
	
	@PostMapping
	public  User saveUser(@RequestBody @Validated User u) {
		
		return userService.saveUser(u);
		
	}
	
	
	@RequestMapping(value="/users",method = RequestMethod.GET)
	public List<User> findAll(){
		return userService.findALL() ;
	}
}
