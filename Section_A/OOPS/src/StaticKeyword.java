class EmpData {
	static int counter = 100;
	int emp_id = 100;
	String name;
	public EmpData(String name) {
		counter++;
		this.emp_id = counter;
		this.name = name;
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		EmpData ram = new EmpData("Ram");
		System.out.println(ram.emp_id + "," + ram.name);
		
		EmpData shyam = new EmpData("Shyam");
		System.out.println(shyam.emp_id + "," + shyam.name);
		
		System.out.println(ram.emp_id + "," + ram.name);
	}

}
