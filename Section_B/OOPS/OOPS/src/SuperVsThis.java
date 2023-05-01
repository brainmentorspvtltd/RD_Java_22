class Parent_1 {
	int x;
	public Parent_1() {
		x = 20;
		System.out.println("Parent class const...");
	}
}

class Child_1 extends Parent_1 {
	int x;
	public Child_1() {
		super();	// java internally uses super
		x = 50;
		System.out.println("Child class const...");
	}
	public Child_1(int x) {
		this();	// calling child class default const...
//		local variable + instance variable + parent variable
		int total = x + this.x + super.x;
		System.out.println("Child class param const..." + total);
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		//Child_1 obj = new Child_1();
		Child_1 obj = new Child_1(30);

	}

}
