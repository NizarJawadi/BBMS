package com.rabta.BBMS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rabta.BBMS.model.User;
import com.rabta.BBMS.repositories.UserRepository;
@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	UserRepository repository ;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	@Override
	public void addUser(User u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		repository.save(u);
		}

	@Override
	public User getUserById(Long id) {
		return repository.findUserByIdUser(id);
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		repository.deleteById(id);
		
	}

}
