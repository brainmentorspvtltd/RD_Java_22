// package OOPS;

import java.util.Scanner;

public class EmpCaller {
    public static void main(String[] args) {
        // Take Input from user
        // empname, dept, basic salary
        // Create object of employee
        // print employee details
        Scanner scanner = new Scanner(System.in);

        MessageReader mr = new MessageReader();

        //System.out.println("Enter your name : ");
        System.out.println(mr.getValue("msg.name"));
        String name = scanner.nextLine();

        // System.out.println("Enter your department : ");
        System.out.println(mr.getValue("msg.dept"));
        String dept = scanner.nextLine();

        // System.out.println("Enter basic salary : ");
        System.out.println(mr.getValue("msg.salary"));
        double salary = scanner.nextDouble();
        Employee ram = new Employee(name, dept, salary);
        System.out.println(ram);

        scanner.close();
    }
}
