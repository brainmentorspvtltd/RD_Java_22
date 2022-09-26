public class Addition {
    public static void main(String[] args) {
        int res = 0;
        int n = args.length;
        // for(int i = 0; i < n; i++) {
        //     res += Integer.parseInt(args[i]);
        // }

        for (String i : args) {
            res += Integer.parseInt(i);
        }

        System.out.println("Result is :: " + res);
    }
}
