public class EmpCaller {
    public static void main(String[] args) {
        // Default Const...
        // EmpDetails ram = new EmpDetails();

        // Calling Parameterized Const...
        EmpDetails ram = new EmpDetails(101, "Ram", 45000.00, "IT");
        // ram.takeInput(101, "Ram", 45000.00, "IT");
        ram.showEmpDetails();

        EmpDetails shyam = new EmpDetails(102, "Shyam", 50000.00, "IT");
        // shyam.takeInput(102, "Shyam", 50000.00, "IT");
        shyam.showEmpDetails();
    }
}
