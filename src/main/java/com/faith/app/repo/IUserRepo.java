package com.faith.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Employee;
import com.faith.app.entity.User;

public interface IUserRepo  extends CrudRepository<User, Integer>{

	@Query("FROM User WHERE userName=?1 AND password=?2 AND isActive=true")
	public User findUserByNameAndPassword(String userName,String password);
}
