package com.cmbt.demo.service;

import com.cmbt.demo.model.User;

import java.util.List;

public interface IUserService {

	List<User> getList();
	
	User getUser(Integer id);

	void insert(User user);

	void update(User user);

	void delete(Long id);
}
