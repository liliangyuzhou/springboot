package com.cmbt.demo.service.impl;

import com.cmbt.demo.mapper.UserMapper;
import com.cmbt.demo.model.User;
import com.cmbt.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userDao;
	
	public List<User> getList() {
		return userDao.getList();
	}

	public User getUser(Integer id) {
		return userDao.getUser(id);
	}

	public void insert(User user){
		userDao.insert(user);
	}

	public void update(User user){
		userDao.update(user);
	}

	public void delete(Long id){
		userDao.delete(id);
	}

}
