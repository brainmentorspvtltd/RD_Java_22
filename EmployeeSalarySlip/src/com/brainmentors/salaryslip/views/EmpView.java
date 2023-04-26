package com.brainmentors.salaryslip.views;

import java.util.Scanner;

import com.brainmentors.salaryslip.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter emp id : ");
		int empID = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter emp name : ");
		String empName = scanner.nextLine();
		
		System.out.println("Enter emp salary : ");
		double salary = scanner.nextDouble();
		
		Employee ram = new Employee(empID, empName, salary);
		//HashCode
		System.out.println(ram);
		// internally it will call toString()
		
		//System.out.println(ram.toString());
		
//		System.out.println("Emp Id : " + ram.getEmpId());
//		System.out.println("Emp Name : " + ram.getName());
//		System.out.println("Emp Basic Salary : " + ram.getSalary());
//		System.out.println("Emp Net Payable Salary : " + ram.netSalary());
		
		scanner.close();
		
	}

}
