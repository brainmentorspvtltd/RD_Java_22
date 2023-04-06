package OOPS;

class Loan {
    void applyForLoan() {
        System.out.println("Apply for Loan...");
    }

    void roi() {
        System.out.println("ROI is 7.5%");
    }
    void timePeriod() {
        System.out.println("Maximum Time Period is 24 Months...");
    }
}

class HomeLoan extends Loan {
    void maxLimit() {
        System.out.println("Max Limit is 20 Lakh");
    }
    @Override
    void roi() {
        System.out.println("ROI for HomeLoan is 12%");
    }
}

class EduLoan extends Loan {
    void marks() {
        System.out.println("Eligible only after 70% marks");
    }
    @Override
    void timePeriod() {
        System.out.println("Max Time Period for Edu Loan is 5 Years");
    }
}

public class IS_A {

    // Polymorphic call
    void caller(Loan loan) {
        loan.applyForLoan();
        loan.roi();
        loan.timePeriod();
        if(loan instanceof HomeLoan) {
            // Downcasting
            HomeLoan homeloan = (HomeLoan)loan;
            homeloan.maxLimit();
        }
        else if(loan instanceof EduLoan) {
            EduLoan eduLoan = (EduLoan)loan;
            eduLoan.marks();
        }
    }

    public static void main(String[] args) {

        IS_A obj = new IS_A();
        obj.caller(new EduLoan());
        obj.caller(new HomeLoan());

        // HomeLoan homeLoan = new HomeLoan();
        // homeLoan.applyForLoan();    // Loan class methods
        // homeLoan.roi();             // HomeLoan - Override
        // homeLoan.timePeriod();      // Loan
        // homeLoan.maxLimit();        // HomeLoan - self method

        // EduLoan eduLoan = new EduLoan();
        // eduLoan.applyForLoan();     // Loan class methods
        // eduLoan.roi();              // Loan
        // eduLoan.timePeriod();       // EduLoan - Override
        // eduLoan.marks();            // EduLoan - self


        // Upcasting and DownCasting
        // Loan loan = new HomeLoan();
        // loan.applyForLoan();
        // loan.roi();
        // loan.timePeriod();
        // loan.maxLimit();

        // loan = new EduLoan();
        // loan.applyForLoan();
        // loan.roi();
        // loan.timePeriod();
        // loan.marks();

        

    }
}
