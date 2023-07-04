package com.faith.app.service;

import com.faith.app.common.APIResponse;
import com.faith.app.entity.User;

public interface IUserService {

	//custom method
	//public  User findUserByNameAndPassword(String userName,String password);
	
	public  APIResponse findUserByNameAndPassword(String userName,String password);
}
