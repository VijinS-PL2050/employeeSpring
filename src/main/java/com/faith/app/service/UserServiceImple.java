package com.faith.app.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.common.APIResponse;
import com.faith.app.entity.User;
import com.faith.app.repo.IUserRepo;
import com.faith.app.util.JwtUtil;

@Service
public class UserServiceImple implements IUserService {

	@Autowired
	private IUserRepo userRepo;
	
	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public APIResponse findUserByNameAndPassword(String userName, String password) {
		
		APIResponse apiResponse=new APIResponse();
		
		//verify user exist or not
		User user=userRepo.findUserByNameAndPassword(userName, password);
		if(user==null) {
			apiResponse.setData("User Login Failed....!");
			return apiResponse;
		}
		
		//credentails are valid generate token
		String token=jwtUtil.generateJwt(user);
		
		//Storing more details and token
		Map<String,Object> data=new HashMap<String,Object>();
		data.put("AccessToken", token);
		data.put("role", user.getRoleId());
		data.put("UserName", user.getUserName());
		apiResponse.setData(data);
		apiResponse.setStatus(200);
		return apiResponse;
	}
	
	/*@Override
	public User findUserByNameAndPassword(String userName, String password) {
		User user=userRepo.findUserByNameAndPassword(userName, password);		
		return user;
	}*/

}
