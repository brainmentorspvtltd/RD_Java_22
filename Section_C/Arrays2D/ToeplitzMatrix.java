package Arrays2D;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,1,2,3},
            {4,5,1,2}
        };
        int row = arr.length;
        int col = arr[0].length;
        outer:
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(arr[i][j] != arr[i+1][j+1]) {
                    System.out.println("Not Toeplitz...");
                    break outer;                    
                }
            }
            
        }
    }
}
