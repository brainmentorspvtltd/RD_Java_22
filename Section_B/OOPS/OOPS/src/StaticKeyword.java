class Emp {
	static int count = 100;
	int id;
	String name;
	String dept;
	public Emp(String name, String dept) {
		this.id = count++;
		this.name = name;
		this.dept = dept;
	}
	void show() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		Emp obj = new Emp("Ram", "IT");
		obj.show();
		Emp obj_2 = new Emp("Raman", "IT");
		obj_2.show();
		
		obj.show();
	}

}
