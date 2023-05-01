/*
 * S.O.L.I.D
 * D - DRY - Donot Repeat Yourself
 *
 */


public class Employee {
	
	int empId;
	String name;
	double salary;
	String department;
	
	public void takeInput(int empId, String name, double salary, String department) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public void showEmp() {
		/* this = refers to current object */
		System.out.println("Id : " + this.empId);
		System.out.println("Name : " + this.name);
		System.out.println("Salary : " + this.salary);
		System.out.println("Department : " + this.department);
	}

	public static void main(String[] args) {
		
		//ram - reference variable
		//Employee - type of ram/object
		// new - reserved keyword used to allocate 
		// new memory
		// Employee() - Constructor of Employee class
		Employee ram = new Employee();
		// will print hashcode of object ram
		//System.out.println(ram);
		
//		ram.empId = 101;
//		ram.name = "Ram Sharma";
//		ram.salary = 45000;
//		ram.department = "IT";
		ram.takeInput(101,"Ram Sharma",45000,"IT");
		ram.showEmp();
		
//		System.out.println("Id : " + ram.empId);
//		System.out.println("Name : " + ram.name);
//		System.out.println("Salary : " + ram.salary);
//		System.out.println("Department : " + ram.department);
		
		
		Employee shyam = new Employee();
		
//		shyam.empId = 102;
//		shyam.name = "Shyam Sharma";
//		shyam.salary = 65000;
//		shyam.department = "IT";
		
		shyam.takeInput(102, "Shyam", 65000, "IT");
		shyam.showEmp();
		
//		System.out.println("Id : " + shyam.empId);
//		System.out.println("Name : " + shyam.name);
//		System.out.println("Salary : " + shyam.salary);
//		System.out.println("Department : " + shyam.department);

	}

}
