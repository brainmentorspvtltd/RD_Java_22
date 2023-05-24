import java.util.Arrays;

public class KWeakest {
    public static void main(String[] args) {
        int arr[][] = {};
        int n = arr.length;
        // int pairs[][] = new int[n][2];
        int pairs[][] = {
            {2,0},
            {4,1},
            {1,2},
            {2,3},
            {5,4}
        };
        // Arrays.sort(pairs); // will give error, because we can't sort 2D array
        
        Arrays.sort(pairs, (a,b)-> {
            if(a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });

        for(int i = 0; i < pairs.length; i++) {
            for(int j = 0; j < pairs[0].length; j++) {
                System.out.print(pairs[i][j] + ",");
            }
            System.out.println();
        }
    }
}
