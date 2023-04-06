package OOPS;

public class StudentCaller {
    public static void main(String[] args) {
        // Calling Default
        // StudentDetails obj_1 = new StudentDetails();

        // Calling parametrized
        StudentDetails obj_1 = new StudentDetails(101, "RaM ShARma", 55.55);
        // obj_1.takeInput(101, "Ram", 55.55);
        // obj_1.showDetails();
        // obj_1.percentage = 10.00;   
        // Object class has a method known as toString
        // toString converts object into a printable format
        System.out.println(obj_1.toString());

        StudentDetails obj_2 = new StudentDetails(102, "Shyam", 65.55);
        // obj_2.takeInput(102, "Shyam", 65.55);
        // obj_2.showDetails();
        System.out.println(obj_2);

        System.out.println(obj_1.getCollege());
        System.out.println(obj_1.getName());
    }
}
