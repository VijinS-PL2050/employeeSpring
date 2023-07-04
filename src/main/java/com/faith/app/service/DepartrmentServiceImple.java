package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Department;
import com.faith.app.repo.IDepartmentRepo;

@Service
public class DepartrmentServiceImple implements IDepartrmentService {

	@Autowired
	private IDepartmentRepo departmentRepo;
	
	@Override
	public List<Department> getDepartments() {
		return (List<Department>) departmentRepo.findAll();
	}

	@Override
	public void insertDepartment(Department depart) {
		departmentRepo.save(depart);
	}

	@Override
	public void deleteDepartment(Department depart) {
		departmentRepo.delete(depart);
		
	}
	
	

}
