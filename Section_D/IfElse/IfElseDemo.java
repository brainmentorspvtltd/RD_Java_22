import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        if(age < 18) {
            System.out.println("Not Eligible...");
        }
        else {
            System.out.println("Eligible...");
        }

        if(age < 0) {
            System.out.println("Negative Number...");
        }
        else {
            System.out.println("Positive Number...");
        }

        scanner.close();
    }
}
