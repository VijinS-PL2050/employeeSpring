package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.Department;

public interface IDepartrmentService {

	//list
	public List<Department> getDepartments();
	
	public void insertDepartment(Department depart);
	
	public void deleteDepartment(Department depart);
	
	
}
