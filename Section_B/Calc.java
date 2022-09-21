public class Calc {
    public static void main(String[] args) {
        int fnum = Integer.parseInt(args[0]);
        int snum = Integer.parseInt(args[2]);
        String opr = args[1];
        System.out.println(fnum + "," + snum + "," + opr);
        int res = 0;
        if(opr.equals("+")) {
            res = fnum + snum;
        }
        else if(opr.equals("-")) {
            res = fnum - snum;
        }
        else if(opr.equals("/")) {
            res = fnum / snum;
        }
        else if (opr.equals("x")) {
            res = fnum * snum;
        }
        System.out.println("Result is : " + res);
    }
}
