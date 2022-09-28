import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        
        // int name = System.in.read();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your id : ");
        int id = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Enter your name : ");
        // String name = scanner.next();
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        byte age = scanner.nextByte();

        scanner.nextLine();

        System.out.print("Enter your city : ");
        String city = scanner.nextLine();

        System.out.print("Enter your salary : ");
        double salary = scanner.nextDouble();

        System.out.println("ID : " +id);
        System.out.println("Hello : " + name);
        System.out.println("Age is : " + age);
        System.out.println("City is : " + city);
        System.out.println("Salary is : " + salary);


        scanner.close();

    }
}
