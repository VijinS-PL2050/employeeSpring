package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.common.Validation;
import com.faith.app.dto.EmployeeDeptDTO;
import com.faith.app.entity.Employee;
import com.faith.app.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImple implements IEmployeeService {

	@Autowired
	private IEmployeeRepo employeeRepo;
	
	@Autowired
	private Validation validation;
	
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		if(validation.isNameValid(employee.getEmployeeName())) {
			return employeeRepo.save(employee);
		}
		
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		return employeeRepo.findById(id).orElseThrow(() ->new RuntimeException("Employee not found for id"+id));
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);

	}

	@Override
	public List<Employee> getEmployeeByName(String name) {

		return employeeRepo.findByEmoloyeeName(name);
	}

	@Override
	public List<EmployeeDeptDTO> getAllDTOEmployees() {

		return employeeRepo.findAllDTOEmployees();
	}

}
