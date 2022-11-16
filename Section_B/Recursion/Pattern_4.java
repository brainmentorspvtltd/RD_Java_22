package Recursion;

public class Pattern_4 {
    static void printSpace(int currentRow) {
        if(currentRow == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(currentRow-1);
    }
    static void printPattern(int currentRow) {
        if(currentRow == 0) {
            return;
        }
        System.out.print("*");
        printPattern(currentRow-1);
    }

    static void pattern(int row, int currentRow) {
        if(row == 0) {
            return;
        }
        printSpace(currentRow);
        printPattern(2*row-1);
        System.out.println();
        pattern(row-1, currentRow + 1);
    }

    public static void main(String[] args) {
        pattern(5, 0);
    }
}
