package com.masseger.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.masseger.entity.User;
import com.masseger.repository.UserRepository;
import com.masseger.service.Interface.IUserService;

public class UserService implements IUserService {
	@Autowired
	private UserRepository userRepository;
	public User getUser(String email) {
		// TODO Auto-generated method stub
		User user=userRepository.findByEmail(email);
		return user;
	}

}
