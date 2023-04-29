//class Loan extends Object {
//	
//}
class Loan {
	void applyForLoan() {
		System.out.println("Loan Apply Process...");
	}
	void roi() {
		System.out.println("ROI is 8.5%");
	}
	void timePeriod() {
		System.out.println("Time Period is 12 months");
	}
}

class HomeLoan extends Loan {
	@Override
	void roi() {
		System.out.println("ROI is 10.00%");
	}
	void eligibility() {
		System.out.println("Your salary must be greater than 50K");
	}
}

class EduLoan extends Loan {
	@Override
	void timePeriod() {
		System.out.println("Time Period is 24 months");
	}
	void repay() {
		System.out.println("On full payment you will be charged 2.5%");
	}
}


public class IsADemo {
	
	// Polymorphic call
	void caller(Loan loan) {
		loan.applyForLoan();
		loan.roi();
		loan.timePeriod();
		// Downcasting
		if(loan instanceof HomeLoan) {
			HomeLoan home = (HomeLoan)loan;
			home.eligibility();
		}
		else if(loan instanceof EduLoan) {
			EduLoan edu = (EduLoan)loan;
			edu.repay();
		}
	}
	
	public static void main(String[] args) {
		
		IsADemo obj = new IsADemo();
		obj.caller(new HomeLoan());
		obj.caller(new EduLoan());
		
//		HomeLoan home = new HomeLoan();
//		home.applyForLoan();	// Loan class
//		home.roi();				// HomeLoan (Override)
//		home.timePeriod();		// Loan class
//		home.eligibility();		// HomeLoan (self)
//		
//		EduLoan edu = new EduLoan();
//		edu.applyForLoan();		// Loan class
//		edu.roi();				// Loan class
//		edu.timePeriod();		// EduLoan (Override)
//		edu.repay();			// EduLoan (self)
		
		// UpCasting - Object type is parent class
		// methods are binded with type of object
//		Loan loan = new HomeLoan();
//		loan.applyForLoan();	// Loan class
//		loan.roi();				// HomeLoan (Override)
//		loan.timePeriod();		// Loan class
//		loan.eligibility();		// HomeLoan (self)
//		
//		loan = new EduLoan();
//		loan.applyForLoan();		// Loan class
//		loan.roi();				// Loan class
//		loan.timePeriod();		// EduLoan (Override)
//		loan.repay();			// EduLoan (self)
		
		
		
	}
}
