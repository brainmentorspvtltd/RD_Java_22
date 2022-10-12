import java.util.Scanner;

public class TakingInputP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your rollNo : ");
        int rollNo = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your name : ");
        // String name = scanner.next();
        String name = scanner.nextLine();

        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

        scanner.close();
    }
}
