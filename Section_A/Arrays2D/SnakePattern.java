public class SnakePattern {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int nrows = arr.length;
        int ncols = arr[0].length;
        for(int i = 0; i < nrows; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < ncols; j++) {
                    System.out.print(arr[i][j] + ",");
                }
            }
            else {
                for(int j = ncols-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + ",");
                }
            }
        }
    }
}
