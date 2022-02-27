package com.app.avi.service;

import com.app.avi.model.User;



public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	

	
}
