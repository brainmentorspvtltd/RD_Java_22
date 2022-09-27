public class Calc {
    public static void main(String[] args) {
        // int fnum = Integer.parseInt(args[0]);
        // int snum = Integer.parseInt(args[1]);

        // int result = fnum + snum;
        // System.out.println("Sum is : " + result);

        int sum = 0;
        int n = args.length;    // return length of array

        for(int i = 0; i < n; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("Sum is : " + sum);

        Integer in = 45;

    }
}
