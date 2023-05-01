class X {
	
}

class Y extends X {
	
}

class User {
	X show() {
		X obj = new X();
		return obj;
	}
}

class PrimeUser extends User {
	@Override
	Y show() {
		Y obj = new Y();
		return obj;
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
