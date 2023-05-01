//final class - cannot perform inheritance on final class
//final class P1 {

final class MyMath {
	private MyMath() {
		
	}
	final static int x = 10;
}

class P1 {
	final void show() {
		
	}
}

class C1 extends P1 {
//	@Override
//	void show() {
//		
//	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.max(0, 0);
		System.out.println(MyMath.x);
		final double PI = 3.14;
		
	}

}
