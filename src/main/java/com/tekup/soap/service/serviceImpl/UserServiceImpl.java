package com.tekup.soap.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.soap.entities.User;
import com.tekup.soap.repository.UserRepository;
import com.tekup.soap.service.UserService;

@Service
public class UserServiceImpl  implements UserService{
	@Autowired
	private UserRepository userRepository ;
	

	@Override
	public User saveUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}

	@Override
	public List<User> findALL() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		userRepository.deleteById(id);
		
	}
	
}
	