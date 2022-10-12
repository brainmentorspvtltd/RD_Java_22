import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter your name : ");
        // reads one character at a time
        // int name = System.in.read();
        // System.out.println("Name is : " + name);

        // Buffer
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello : " + name);

        scanner.close();

    }
}
