// package OOPS;

import java.util.Date;

public class Employee {
    private String name;
    private String dept;
    private double salary;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    // Getter and Setter

    // Earnings
    public double getHRA() {
        return salary * 0.25;
    }
    public double getTA() {
        return salary * 0.15;
    }
    public double getMA() {
        return salary * 0.10;
    }
    public double getDA() {
        return salary * 0.30;
    }

    // Deductions
    public double getTDS() {
        return salary * 0.10;
    }
    public double getPF() {
        return salary * 0.05;
    }

    public double netSalary() {
        double earnings = salary + getHRA() + getDA() + getMA() + getTA();
        double deductions = getTDS() + getPF();
        double totalSalary = earnings - deductions;
        return totalSalary;
    }

    @Override
    public String toString() {
        // HasA
        EmpUtils utils = new EmpUtils();
        // Date date = utils.dateFormat();
        String date = utils.dateFormat();
        String sal = utils.salaryFormat(netSalary());
        return "Date : " + date + "\n" +
         "Name : " + this.name + "\n" + "Salary : " + sal;
    }

}
