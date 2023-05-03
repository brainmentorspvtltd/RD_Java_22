package com.brainmentors.salaryslip.controller;

//public class Employee extends Object {
// internally each class inherit Object Class

public class Employee {
	private int empId;
	private String name;
	private double salary;
	
	private String dept;
	private String designation;
	private String location;
	
	//Constructor
	/*
	 * constructor looks like a function
	 * but it cannot have any return type
	 * by default every java class has a default constructor
	 */
	
	public Employee() {
		this.location = "Noida";
	}
	
	/*
	 * This is parameterized constructor
	 */
	public Employee(int empId, String name, double salary) {
		this(); 	// will call default const.
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	// Earnings
	private double getHRA() {
		return salary * 0.25;
	}
	
	private double getTA() {
		return salary * 0.15;
	}
	
	private double getDA() {
		return salary * 0.30;
	}
	
	private double getMA() {
		return salary * 0.10;
	}
	
	// Deductions
	private double getTDS() {
		return salary * 0.10;
	}
	private double getPF() {
		return salary * 0.05;
	}
	
	// Net Salary Calculation
	public double netSalary() {
		double earnings = salary + getHRA() + getTA() + getDA() + getMA();
		double deductions = getTDS() + getPF();
		double netSal = earnings - deductions;
		return netSal;
	}
	
	@Override
	public String toString() {
		CommonUtils utils = new CommonUtils();
		name = utils.formatName(name);
		return "Emp ID : " + empId + "\n" +
				"Emp Name : " + name + "\n" + 
				"Emp Basic Salary : " + salary + "\n" +
				"Emp Net Salary : " + netSalary();
	}
	
}
