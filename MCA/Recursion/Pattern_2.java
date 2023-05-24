public class Pattern_2 {
    static void printSpace(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(n - 1);
    }

    static void printStar(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("* ");
        printStar(n - 1);
    }

    static void pattern(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printSpace(rows);
        printStar(currentRow);
        System.out.println();
        pattern(rows-1, currentRow+1);
    }

    public static void main(String[] args) {
        pattern(5, 1);
    }
}
