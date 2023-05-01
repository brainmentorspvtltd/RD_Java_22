package OOPS;

// DRY - Don't Repeat Yourself

class Student {
    // Instance Variables
    String name;
    int rollNo;
    double fees;
    String course;
    String branch;

    // Member Functions
    void takeInput(String name, int rollNo, double fees, String course, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.fees = fees;
        this.course = course;
        this.branch = branch;
    }

    void showStudent() {
        // this
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Name : " + this.name);
        System.out.println("Fess : " + this.fees );
        System.out.println("Course : " + course);
        System.out.println("Branch : " + branch);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student ram = new Student();
        // ram.rollNo = 1;
        // ram.name = "Ram";
        // ram.course = "Btech";
        // ram.fees = 50000.00;
        // ram.branch = "CS";
        ram.takeInput("Ram", 101, 55000.00, "BCA", "CS");
        ram.showStudent();
        // System.out.println("Roll No : " + ram.rollNo);
        // System.out.println("Name : " + ram.name);
        // System.out.println("Fess : " + ram.fees );
        // System.out.println("Course : " + ram.course);
        // System.out.println("Branch : " + ram.branch);


        Student shyam = new Student();
        // shyam.rollNo = 2;
        // shyam.name = "Shyam";
        // shyam.course = "Btech";
        // shyam.fees = 50000.00;
        // shyam.branch = "CS";
        shyam.takeInput("Shyam", 102, 50000.00, "Btech", "EC");
        shyam.showStudent();
        // System.out.println("Roll No : " + shyam.rollNo);
        // System.out.println("Name : " + shyam.name);
        // System.out.println("Fess : " + shyam.fees );
        // System.out.println("Course : " + shyam.course);
        // System.out.println("Branch : " + shyam.branch);
    }
}
