public class ToeplitzMatrix {
    static boolean checkToeplitz(int arr[][]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] != arr[i+1][j+1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4,5},
            {7,1,2,3,4},
            {6,7,1,2,3},
            {5,6,7,1,2},
            {4,5,6,7,1}
        };
    }
}
