package OOPS;

// Encapsulation - wrapping of data into a single unit
// Data Abstraction - hiding of details

// Good Encapsulation - Encapsulation + Abstraction
// methods are public but variables are private

// Is A
// public class StudentDetails extends Object {
public class StudentDetails{
    private String name;
    private int rollNo;
    private double percentage;
    private String college;

    // Constructor
    // Default Constructor
    // used to initialize variables
    // it is executed whenever we create object of class
    // constructor name will be same as class name
    // if we make constructor private then we cannot create object of class
    public StudentDetails() {
        this("CS");
        this.college = "RD";
        System.out.println("Default Const...");
    }

    public StudentDetails(String branch) {
        System.out.println("Branch Constructor");
    }

    // Parametrized constructor
    public StudentDetails(int rollNo, String name, double percentage) {
        this();     // constructor chaining
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage; 
        System.out.println("Param Const...");
    }

    // Getter Setter
    public String getCollege() {
        return this.college;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    // void takeInput(int rollNo, String name, double percentage) {
    //     this.rollNo = rollNo;
    //     this.name = name;
    //     this.percentage = percentage;
    // }

    // void showDetails() {
    //     // this - current object reference
    //     System.out.println("College : " + this.college);
    //     System.out.println("Name : " + this.name);
    //     System.out.println("Roll No : " + rollNo);
    //     System.out.println("Percentage : " + percentage);
    // }

    
    @Override
    public String toString() {
        // HasA Relation
        StudentUtils utils = new StudentUtils();
        this.name = utils.formatName(name);
        return this.name + "\n" + this.rollNo + "\n" + this.percentage;
    }
}
