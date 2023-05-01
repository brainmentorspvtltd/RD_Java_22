class Emp {
	static int counter;
	// static block
	static {
		System.out.println("Static block executed...");
		counter = 100;
	}
	int id;
	String name;
	String dept;

	// Init block
	{
		System.out.println("Init block executed...");
		dept = "IT";
	}
	Emp(String name, String dept) {
		System.out.println("Const block executed...");
		counter++;
		this.id = counter;
		this.name = name;
		this.dept = dept;
	}
	void show() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Dept : " + dept);
	}
}

public class EMS {

	public static void main(String[] args) {
		
		Emp ram = new Emp("Ram", "IT");
		ram.show();
		Emp shyam = new Emp("Shyam", "HR");
		shyam.show();
		
		ram.show();

	}

}
