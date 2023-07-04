package com.faith.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeid")
	private Integer id;
	
	@Column(name="employeename",nullable=false,length=60)
	private String employeeName;
	
	@Column(name="designation",nullable=false,length=60)
	private String designation;
	
	@Column(name="dateofjoining",nullable=false,length=60)
	private LocalDate dateofjoining;
	
	private boolean isActive=true;
	
	
	private Integer departmentid;
	@ManyToOne
	@JoinColumn(name="departmentid",insertable=false,updatable=false)
	@JsonBackReference
	private Department department;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String employeeName, String designation, LocalDate dateofjoining, boolean isActive,
			Integer departmentid, Department department) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.designation = designation;
		this.dateofjoining = dateofjoining;
		this.isActive = isActive;
		this.departmentid = departmentid;
		this.department = department;
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
	public LocalDate getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(LocalDate dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", dateofjoining=" + dateofjoining + ", isActive=" + isActive + ", departmentid=" + departmentid
				+ ", department=" + department + "]";
	}
	
	
	
}
