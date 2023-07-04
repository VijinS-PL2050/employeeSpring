package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.common.APIResponse;
import com.faith.app.dto.EmployeeDeptDTO;
import com.faith.app.entity.Employee;
import com.faith.app.service.IEmployeeService;
import com.faith.app.util.JwtUtil;

@CrossOrigin // inorder eliminate port number conflict
@RestController //@Controller + @configuration
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(@RequestHeader(value="Authorization",defaultValue="") String auth){
		
		APIResponse apiResponse=new APIResponse();
		//check jwt
		//jwtUtil.verify(auth);
		
		return employeeService.getEmployee();
		
	}
	
	//get employee by id
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
		
	}
	
	//add employee
	/*@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}*/
	
	@PostMapping("/employees")
	public ResponseEntity<APIResponse> addEmployee(@RequestBody Employee employee){
		System.out.println(employee.toString());
		APIResponse apiResponse=new APIResponse();
		if(employeeService.saveEmployee(employee)==null) {
			apiResponse.setData("Name can be all alphabets");
			apiResponse.setStatus(500);
			apiResponse.setError("INVALID NAME");
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setStatus(200);
		apiResponse.setData("Employee added successfully");
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
	
	
	
	//update employee
	@PutMapping("/employees")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
	
	//search employee by name
	@GetMapping("/employees/search/{name}")
	public List<Employee> getAllEmployeesByName(@PathVariable String name){
		return employeeService.getEmployeeByName(name);
		
	}
	
	//inner join
	@GetMapping("/employees/dto")
	public List<EmployeeDeptDTO> getAllDTOEmployees(){
		return employeeService.getAllDTOEmployees();
		
	}
}
