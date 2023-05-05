class Loan {
	void apply() {
		System.out.println("Loan Apply Process...");
	}
	void roi() {
		System.out.println("ROI is 8.5%");
	}
	void timePeriod() {
		System.out.println("Min Time Period is 12 months");
	}
}

class HomeLoan extends Loan {
	@Override
	void roi() {
		System.out.println("ROI is 10.00%");
	}
	void eligibility() {
		System.out.println("Salary must be min 40K");
	}
}

class EduLoan extends Loan {
	@Override
	void timePeriod() {
		System.out.println("Min Time Period is 24 months");
	}
	void qualification() {
		System.out.println("Student must be graduate");
	}
}

public class IsADemo {
	
	// Polymorphic call
	void caller(Loan loan) {
		loan.apply();
		loan.roi();
		loan.timePeriod();
		// Downcasting
		if(loan instanceof HomeLoan) {
			HomeLoan home = (HomeLoan)loan;
			home.eligibility();
			//((HomeLoan) loan).eligibility();
		}
		else if(loan instanceof EduLoan) {
			EduLoan edu = (EduLoan)loan;
			edu.qualification();
		}
	}

	public static void main(String[] args) {
		
		IsADemo obj = new IsADemo();
		obj.caller(new HomeLoan());
		obj.caller(new EduLoan());
		
//		HomeLoan home = new HomeLoan();
//		home.apply();	// Loan class
//		home.roi();		// HomeLoan (Override)
//		home.timePeriod();	// Loan class
//		home.eligibility();	// HomeLoan (self)
//		
//		EduLoan edu = new EduLoan();
//		edu.apply();		// Loan class
//		edu.roi();		// Loan class
//		edu.timePeriod();	// EduLoan (Override)
//		edu.qualification();	// EduLoan (self)
		
		
		/*
		 * if we create object of child class, then we can use parent
		 * class a type of object
		 * It is known as Upcasting
		 * methods are binded with type of object
		 */
//		Loan loan = new HomeLoan();
//		loan.apply();	// Loan class
//		loan.roi();		// HomeLoan (Override)
//		loan.timePeriod();	// Loan class
		//loan.eligibility();	// HomeLoan (self)
//		
//		loan = new EduLoan();
//		loan.apply();		// Loan class
//		loan.roi();		// Loan class
//		loan.timePeriod();	// EduLoan (Override)
		//loan.qualification();	// EduLoan (self)

	}

}
