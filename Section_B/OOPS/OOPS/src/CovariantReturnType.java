class P {
	
}

class C extends P {
	
}

class User {
	P show() {
		P obj = new P();
		return obj;
	}
}

class PrimeUser extends User {
	@Override
	C show() {
		C obj = new C();
		return obj;
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
