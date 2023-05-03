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

	public static void main(String[] args) {
		
		HomeLoan home = new HomeLoan();
		home.apply();	// Loan class
		home.roi();		// HomeLoan (Override)
		home.timePeriod();	// Loan class
		home.eligibility();	// HomeLoan (self)
		
		EduLoan edu = new EduLoan();
		edu.apply();		// Loan class
		edu.roi();		// Loan class
		edu.timePeriod();	// EduLoan (Override)
		edu.qualification();	// EduLoan (self)

	}

}
