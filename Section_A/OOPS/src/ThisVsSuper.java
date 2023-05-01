class P {
	int x;
	P() {
		x = 50;
		System.out.println("P class default const...");
	}
}

class C extends P {
	int x;
	C() {
		super();	// super is written internally
		x = 20;
		System.out.println("C class default const...");
	}
	C(int x) {
		this();
		//super();
		//local variable + instance variable + parent variable
		int total = x + this.x + super.x;
		System.out.println("C class param const..." + total);
	}
}

public class ThisVsSuper {

	public static void main(String[] args) {
		C obj = new C(10);
	}

}
