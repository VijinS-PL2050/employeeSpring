package com.faith.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.dto.EmployeeDeptDTO;
import com.faith.app.entity.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

	// custom method to search name using JPQL

	@Query("FROM Employee WHERE employeeName like %?1%")
	public List<Employee> findByEmoloyeeName(String name);

	// inner join
	@Query("SELECT new com.faith.app.dto.EmployeeDeptDTO(e.id, e.employeeName, e.designation, d.departmentName) FROM Employee e INNER JOIN e.department d ORDER BY e.id")
	public List<EmployeeDeptDTO> findAllDTOEmployees();

}
