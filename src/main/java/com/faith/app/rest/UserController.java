package com.faith.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.common.APIResponse;
import com.faith.app.service.UserServiceImple;

@CrossOrigin // inorder eliminate port number conflict
@RestController //@Controller + @configuration
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserServiceImple userServiceImple;
	
	/*@GetMapping("/user/{userName}&{password}")
	public User findUserByNameAndPassword(@PathVariable String userName,@PathVariable String password) {

		return userServiceImple.findUserByNameAndPassword(userName, password);
		
	}*/
	@GetMapping("/user/{userName}&{password}")
	public ResponseEntity<APIResponse> findUserByNameAndPassword(@PathVariable String userName,@PathVariable String password) {

		System.out.println("oiuytr");
		APIResponse apiResponse=userServiceImple.findUserByNameAndPassword(userName, password);
		
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		
	}
	

}
