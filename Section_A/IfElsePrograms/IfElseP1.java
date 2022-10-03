import java.util.Scanner;

public class IfElseP1 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        
        if(age > 18) {
            System.out.println("You are eligible to vote...");
        }
        else {
            System.out.println("You are not eligible to vote...");
        }

        scanner.close();

    }
}
