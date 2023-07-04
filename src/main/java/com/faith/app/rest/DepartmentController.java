package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Department;
import com.faith.app.service.IDepartrmentService;



@CrossOrigin // inorder eliminate port number conflict
@RestController //@Controller + @configuration
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	private IDepartrmentService departrmentService;
	
	@GetMapping("/department")
	public List<Department> getAllDepartment(){
		System.out.println(departrmentService.getDepartments());
		return departrmentService.getDepartments();
	}
	
	@PostMapping("/department")
	public void insertDepartment(@RequestBody  Department depart) {
		
		departrmentService.insertDepartment(depart);
	}
	
	@DeleteMapping("/department")
	public void deleteDepartment(@RequestBody  Department depart) {
		departrmentService.deleteDepartment(depart);
	}
	
}
