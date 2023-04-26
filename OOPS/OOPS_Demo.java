// package OOPS;

// class - blueprint of object
class Employee {
    // Instance Variables
    int emp_id;
    String emp_name;
    double emp_salary;
    String dept;

    void takeInput(int emp_id, String emp_name, double emp_salary, String dept) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.dept = dept;
    }

    void showEmpDetails() {
        // java internally uses this keyword
        // this refers to the current object
        System.out.println("ID : " + this.emp_id);
        System.out.println("Name : " + this.emp_name);
        System.out.println("Salary : " + emp_salary);
        System.out.println("Department : " + dept);
    }
}

public class OOPS_Demo {
    public static void main(String[] args) {
        Employee ram = new Employee();
        // ram.emp_id = 101;
        // ram.emp_name = "Ram";
        // ram.emp_salary = 45000.00;
        // ram.dept = "IT";
        ram.takeInput(101, "Ram", 45000.00, "IT");
        ram.showEmpDetails();
        // System.out.println("ID : " + ram.emp_id);
        // System.out.println("Name : " + ram.emp_name);
        // System.out.println("Salary : " + ram.emp_salary);
        // System.out.println("Department : " + ram.dept);

        Employee shyam = new Employee();
        // shyam.emp_id = 102;
        // shyam.emp_name = "Shyam";
        // shyam.emp_salary = 45000.00;
        // shyam.dept = "IT";
        shyam.takeInput(102, "Shyam", 50000.00, "IT");
        shyam.showEmpDetails();
        // System.out.println("ID : " + shyam.emp_id);
        // System.out.println("Name : " + shyam.emp_name);
        // System.out.println("Salary : " + shyam.emp_salary);
        // System.out.println("Department : " + shyam.dept);
    }
}
