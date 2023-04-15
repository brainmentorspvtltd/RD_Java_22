package com.bmpl.ems.views;

import java.util.Scanner;

import com.bmpl.ems.controller.LoginController;
import com.bmpl.ems.controller.RegisterController;
import com.bmpl.ems.model.Message;

public class LoginView {
	void doLogin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Emp ID : ");
		String id = scanner.nextLine();
		
		System.out.println("Enter Emp Password : ");
		String pwd = scanner.nextLine();
		
		LoginController controller = new LoginController();
		Message msg = controller.loginReq(id, pwd);
		System.out.println(msg.getDate());
		System.out.println(msg.getId());
		System.out.println(msg.getMsg());
		
		scanner.close();
	}
	
	void doRegister() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Emp ID : ");
		String id = scanner.nextLine();
		
		System.out.println("Enter Emp Name : ");
		String name = scanner.nextLine();
		
		System.out.println("Enter Emp Password : ");
		String pwd = scanner.nextLine();
		
		System.out.println("Enter Emp Department : ");
		String dept = scanner.nextLine();
		
		System.out.println("Enter Emp Salary : ");
		double salary = scanner.nextDouble();
		
		Emp obj = new Emp();
		obj.setId(id);
		obj.setName(name);
		obj.setDepartment(dept);
		obj.setPassword(pwd);
		obj.setSalary(salary);
		
		RegisterController controller = new RegisterController();
		controller.regReq(obj);
	}
}
