package com.Employee.boot.EmployeeManagement;

public class Employee {
	private long Employeeid;
	private String EmployeeName;
	private String EmployeeDepartment;
	private String EmployeeDesignation;
	private long EmployeeSalary;
	public Employee(long employeeid, String employeeName, String employeeDepartment, String employeeDesignation,
			long employeeSalary) {
		super();
		Employeeid = employeeid;
		EmployeeName = employeeName;
		EmployeeDepartment = employeeDepartment;
		EmployeeDesignation = employeeDesignation;
		EmployeeSalary = employeeSalary;
	}
	public long getEmployeeid() {
		return Employeeid;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public String getEmployeeDepartment() {
		return EmployeeDepartment;
	}
	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}
	public long getEmployeeSalary() {
		return EmployeeSalary;
	}
	
	}

