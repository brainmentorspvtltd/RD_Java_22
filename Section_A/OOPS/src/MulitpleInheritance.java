interface P3 {
	int x = 10;
	default void show() {
		System.out.println("Hello P3");
	}
}

interface P4 {
	int x = 20;
	default void show() {
		System.out.println("Hello P4");
	}
}

class C3 implements P3, P4 {

	@Override
	public void show() {
		System.out.println(P3.x);
	}
	
}

public class MulitpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
