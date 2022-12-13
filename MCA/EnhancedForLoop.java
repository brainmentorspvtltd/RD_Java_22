import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args) {
        // int x[] = {3,2,5,7,12};
        // for(int i = 0; i < x.length; i++) {
        //     System.out.println(x[i]);
        // }

        // for(int i : x) {
        //     System.out.println(i);
        // }

        String arr[] = {"hello","world","this","is","java"};
        for(String i : arr) {
            System.out.println(i);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println(name);

        String nameArr[] = name.split(" ");
        String fullName = "";
        for(String word : nameArr) {
            String n = String.valueOf(word.charAt(0)).toUpperCase() + 
            word.substring(1).toLowerCase();
            fullName = fullName + n + " ";
        }

        System.out.println(fullName);


        scanner.close();

    }
}
