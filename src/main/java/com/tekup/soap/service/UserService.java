package com.tekup.soap.service;

import java.util.List;

import com.tekup.soap.entities.User;

public interface UserService {
	public   User saveUser(User u) ;
	public void deleteById(Long id);
	
	
	public List<User> findALL();

}
