import java.util.Scanner;

public class StudentCaller {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roll No : ");
		int rollNo = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter Name : ");
		String name = scanner.nextLine();
		
		System.out.println("Enter Course : ");
		String course = scanner.nextLine();
		
		System.out.println("Enter Percentage : ");
		double percentage = scanner.nextDouble();
		
		// will call default constructor
		//StudentDetails ram = new StudentDetails();
		
		// will call parameterized constructor
		StudentDetails ram = new StudentDetails(rollNo, name, course, percentage);
		//ram.takeInput("Ram", 101, "Btech", "CS");
		//ram.percentage = 0.00;
//		System.out.println("College : " + ram.getCollege());
//		System.out.println("Roll No : " + ram.getRollNo());
//		System.out.println("Name : " + ram.getName());
//		System.out.println("Course : " + ram.getCourse());
//		System.out.println("Branch : " + ram.getBranch());
//		System.out.println("Percentage : " + ram.getPercentage());
		
		// HashCode - representable form of an object
		// when we print an object then it calls a method toS
		//System.out.println(ram);
		// toString is defined inside Object Class
		System.out.println(ram.toString());
		
		StudentDetails shyam = new StudentDetails(102, "Shyam", "MCA", 80.00);
		//shyam.takeInput("Shyam", 102, "Btech", "CS");
		System.out.println(shyam);
		
//		System.out.println("College : " + shyam.college);
//		System.out.println("Roll No : " + shyam.rollNo);
//		System.out.println("Name : " + shyam.name);
//		System.out.println("Course : " + shyam.course);
//		System.out.println("Branch : " + shyam.branch);
//		System.out.println("Percentage : " + shyam.percentage);
		
		scanner.close();
		
	}

}
