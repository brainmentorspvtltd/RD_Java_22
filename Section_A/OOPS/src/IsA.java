class Loan {
	void apply() {
		System.out.println("Apply for loan...");
	}
	void emi() {
		System.out.println("EMI for loan");
	}
	void roi() {
		System.out.println("ROI for loan is 8.5%");
	}
}

class HomeLoan extends Loan {
	void eligibility() {
		System.out.println("Min balance must be 50000");
	}
	@Override
	void roi() {
		System.out.println("Home Loan ROI is 10.00%");
	}
	
}

class EduLoan extends Loan {
	void timePeriod() {
		System.out.println("Edu Loan time period is 5 years");
	}
	@Override
	void emi() {
		System.out.println("EMI for EduLoan");
	}
}

public class IsA {
	
	// Polymorphic call
	void caller(Loan loan) {
		loan.apply();
		loan.emi();
		loan.roi();
		
		// Downcasting
		if(loan instanceof HomeLoan) {
			HomeLoan homeLoan = (HomeLoan)loan;
			homeLoan.eligibility();
		}
		else if(loan instanceof EduLoan) {
			EduLoan eduLoan = (EduLoan)loan;
			eduLoan.timePeriod();
		}
	}

	public static void main(String[] args) {
		IsA obj = new IsA();
		// Upcasting
		obj.caller(new HomeLoan());
		obj.caller(new EduLoan());
		
//		HomeLoan homeLoan = new HomeLoan();
//		homeLoan.apply();	// Loan
//		homeLoan.roi();		// HomeLoan
//		homeLoan.emi();		// Loan
//		homeLoan.eligibility();	// HomeLoan
//		
//		EduLoan eduLoan = new EduLoan();
//		eduLoan.apply();		// Loan
//		eduLoan.roi();			// Loan
//		eduLoan.emi();			// EduLoan
//		eduLoan.timePeriod();	// EduLoan
		
		// Upcasting
//		Loan loan = new HomeLoan();
//		loan.apply();	// Loan
//		loan.roi();		// HomeLoan - override
//		loan.emi();		// Loan
//		//loan.eligibility();	// HomeLoan - self
//		
//		loan = new EduLoan();
//		loan.apply();		// Loan
//		loan.roi();			// Loan
//		loan.emi();			// EduLoan - override
//		//loan.timePeriod();	// EduLoan - self
		
		
	}

}
