package com.bankapp.model.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.dao.User;
import com.bankapp.model.dao.UserDao;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public User deleteUser(User user) {
		return userDao.delUser(user);
	}

	@Override
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public User getUser(String username, String password) {
		return userDao.getUser(username, password);
	}
	
	@Override
	public User getUser(String username){
		return userDao.getUser(username);
	}


	@Override
	public boolean isUserExist(String username) {
		boolean isValidUser = false;
		List<User> users = userDao.getAllUsers();
		for(User user : users) {
			if(user.getUsername().equals(username)) {
				isValidUser = true;
			}
		}
		return isValidUser;
	}

	@Override
	public User updateUser(int uid, User user) {
		return userDao.updateUser(uid, user);
	}

	@Override
	public User getUserById(int accountId) {
		
		return userDao.getUserById(accountId);
	}

	@Override
	public User updateUser(Integer uid, User userBean) {
		return userDao.updateUser(uid, userBean);
		
	}
	

}

