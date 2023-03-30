package Arrays2D;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {4,5,6,2}
        };
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("====================");

        for(int j = 0; j < col; j++) {
            for(int i = 0; i < row; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
