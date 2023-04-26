// DRY - Don't Repeat Yourself
// SRP - Single Responsibility Principle

// Encapsulation - Wrapping of data in one single unit - class

public class EmpDetails {
    // Instance Variables
    int emp_id;
    String emp_name;
    double emp_salary;
    String dept;
    String company;

    // Default Constructor
    // used to initialize variables
    // it is same name as class name
    // it looks like a method but it's not
    // because it don't have any return type
    // it is called whenever we create object of class
    public EmpDetails() {
        this("IT");
        System.out.println("Default Const. Called...");
        this.company = "Brain Mentors";
    }

    public EmpDetails(String dept) {
        System.out.println("Default Const. Called...");
        this.company = "Brain Mentors";
    }

    // Parameterized Constructor
    public EmpDetails(int emp_id, String emp_name, double emp_salary, String dept) {
        // Constructor Chaining
        this();     // calling default constructor
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.dept = dept;
    }

    // void takeInput(int emp_id, String emp_name, double emp_salary, String dept) {
    //     this.emp_id = emp_id;
    //     this.emp_name = emp_name;
    //     this.emp_salary = emp_salary;
    //     this.dept = dept;
    // }

    void showEmpDetails() {
        // java internally uses this keyword
        // this refers to the current object
        System.out.println("Company : " + company);
        System.out.println("ID : " + this.emp_id);
        System.out.println("Name : " + this.emp_name);
        System.out.println("Salary : " + emp_salary);
        System.out.println("Department : " + dept);
    }
}
