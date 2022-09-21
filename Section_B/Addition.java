public class Addition {
    public static void main(String[] args) {
        int n = args.length;
        int sum = 0;
        // for(int i = 0; i < n; i++) {
        //     sum += Integer.parseInt(args[i]);
        // }

        for (String i : args) {
            sum += Integer.parseInt(i);
        }

        System.out.println("Sum is : " + sum);
    }
}
