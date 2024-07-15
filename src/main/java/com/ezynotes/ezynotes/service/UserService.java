package com.ezynotes.ezynotes.service;

import com.ezynotes.ezynotes.entity.User;

public interface UserService {

	public User saveUser(User user);

	public boolean existEmailCheck(String email);
	
	//added

}
