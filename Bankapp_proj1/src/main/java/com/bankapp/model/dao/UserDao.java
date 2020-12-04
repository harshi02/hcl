package com.bankapp.model.dao;

import java.util.*;

public interface UserDao {
	public List<User> getAllUsers();
	public User updateUser(User user);
	public User delUser(User user);
	public User addUser(User user);
	public User getUser(String username, String password);
	public User getUser(String username);
	public User updateUser(int uid, User user);
	User getUserById(int accountId);
	

}
