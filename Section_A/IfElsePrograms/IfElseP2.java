import java.util.Scanner;

public class IfElseP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num : ");
        int fnum = sc.nextInt();
        
        System.out.println("Enter second num : ");
        int snum = sc.nextInt();

        if(fnum > snum) {
            System.out.println(fnum + " is greater");
        }
        else {
            System.out.println(snum + " is greater");
        }
        sc.close();

    }
}
