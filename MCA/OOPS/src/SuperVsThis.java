class Parent {
	int x;
	public Parent() {
		x = 10;
		System.out.println("Parent class default const...");
	}
	public Parent(int x) {
		this();
		System.out.println("Parent class param const...");
	}
}
class Child extends Parent {
	int x;
	public Child() {
		//super();	// java internally uses super
		//this(10);
		super(15);
		x = 20;
		System.out.println("Child class default const...");
	}
	public Child(int x) {
		this();
		//super();
		int total = x + this.x + super.x;
		System.out.println("Child class param const...");
		System.out.println("Total is : " + total);
	}
}
public class SuperVsThis {

	public static void main(String[] args) {
		//Child obj = new Child();
		Child obj = new Child(50);
	}

}
