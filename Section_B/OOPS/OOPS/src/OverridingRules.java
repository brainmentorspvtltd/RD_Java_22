class Parent {
	private void show() {
		System.out.println("Show...");
	}
}

class Child extends Parent {
	//@Override
	protected void show() {
		System.out.println("Show...");
	}
}

public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
