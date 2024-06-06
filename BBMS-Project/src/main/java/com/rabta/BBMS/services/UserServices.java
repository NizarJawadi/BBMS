package com.rabta.BBMS.services;

import java.util.List;

import com.rabta.BBMS.model.User;

public interface UserServices {

	public void addUser(User u);

	public User getUserById(Long id);

	public List<User> getAllUsers();

	public void deleteUser(Long id);

}
