// Class name should start with a capital letter
// Class name can only start a letter or underscore or dollar
// Class name should be a verb
class Employee {
	// Instance Variables
	int id;
	String name;
	double salary;
	String dept;
	
	void takeInput(int id, String name, double salary, String dept) {
		// Local Variables
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	void showEmpDetails() {
		// java internally uses this keyword
		// this - it refers to current object
		System.out.println("ID : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Salary : " + salary);
		System.out.println("Dept : " + dept);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		Employee ram = new Employee();
//		ram.id = 101;
//		ram.name = "Ram";
//		ram.dept = "IT";
//		ram.salary = 45000.00;
		ram.takeInput(101, "Ram", 45000.00, "IT");
		ram.showEmpDetails();
//		System.out.println("ID : " + ram.id);
//		System.out.println("Name : " + ram.name);
//		System.out.println("Salary : " + ram.salary);
//		System.out.println("Dept : " + ram.dept);
		
		Employee shyam = new Employee();
//		shyam.id = 102;
//		shyam.name = "Shyam";
//		shyam.dept = "IT";
//		shyam.salary = 50000.00;
		shyam.takeInput(102, "Shyam", 50000.00, "HR");
		shyam.showEmpDetails();
//		System.out.println("ID : " + shyam.id);
//		System.out.println("Name : " + shyam.name);
//		System.out.println("Salary : " + shyam.salary);
//		System.out.println("Dept : " + shyam.dept);
		
		Employee x = ram;
		
	}

}
