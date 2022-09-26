public class CommandLine {
    public static void main(String[] args) {
        // System.out.println("Hello World...");
        // String fname = args[0];
        // String lname = args[1];
        // System.out.println("Hello " + fname + " " + lname);

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x + y;
        System.out.println("Sum is : " + z);


    }
}
