//SRP - Single Responsibility Principle

//Encapsulation - wrapping of data in a single unit
//Good Encapsulation = Data abstraction + Encapsulation
//Data Abstraction = Variables are private and methods are public

//public class StudentDetails extends Object {
public class StudentDetails {
	private int rollNo;
	private String name;
	private double percentage;
	private String course;
	private String branch;
	private String college;
	
	// Default Constructor
	// same name as class
	// look like a method but do not have any return type
	// used to initialize variables
	public StudentDetails() {
		this.college = "RDEC";
		System.out.println("Default Const... Called...");
	}
	
	public StudentDetails(String branch) {
		this();
		this.branch = branch;
		System.out.println("Branch Const. Called...");
	}
	
	// Parameterized Constructor
	public StudentDetails(int rollNo, String name, String course, double percentage) {
		// constructor chaining
		//this();	// will call default constructor
		this("CS");
		this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.percentage = percentage;
        System.out.println("Param Const...");
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}
	
	// Member Functions
//    void takeInput(String name, int rollNo, String course, String branch) {
//    	this.name = name;
//        this.rollNo = rollNo;
//        this.course = course;
//        this.branch = branch;
//    }
	
	@Override
	public String toString() {
		Utils utils = new Utils();
		this.name = utils.formatName(name);
		return "Roll No : " + rollNo + "\n" + 
				"Name : " + name + "\n" +
				"Percentage : " + percentage + "\n" +
				"Branch : " + branch;
	}
	
}
