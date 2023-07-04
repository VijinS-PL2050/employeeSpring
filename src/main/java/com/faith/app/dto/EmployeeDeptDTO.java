package com.faith.app.dto;

public class EmployeeDeptDTO {

	
	private Integer id;
	private String employeeName;
	private String designation;
	private String departmentName;
	public EmployeeDeptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDeptDTO(Integer id, String employeeName, String designation, String departmentName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.designation = designation;
		this.departmentName = departmentName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "EmployeeDeptDTO [id=" + id + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", departmentName=" + departmentName + "]";
	}
	
	
}
