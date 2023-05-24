public class Pattern_1 {
    // *
    // **
    // ***
    // ****
    // *****
    static void printStar(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("*");
        printStar(n - 1);
    }

    static void pattern(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        // printStar(currentRow);
        printStar(rows);
        System.out.println();
        pattern(rows-1, currentRow+1);
    }

    public static void main(String[] args) {
        pattern(5, 1);
    }
}
