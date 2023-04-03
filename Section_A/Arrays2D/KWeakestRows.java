import java.util.Arrays;

public class KWeakestRows {
    public static void main(String[] args) {
        int arr[][] = {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}};
        int n = arr.length;
        int m = arr[0].length;
        int pairs[][] = new int[n][2];
        // int pairs[][] = {
        //     {2,0},
        //     {4,1},
        //     {1,2},
        //     {2,3},
        //     {5,4}
        // };

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 1) {
                    count++;
                }
            }
            pairs[i][0] = count;
            pairs[i][1] = i;
        }

        // Logic...
        Arrays.sort(pairs, (a,b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });

        for(int i = 0; i < pairs.length; i++) {
            for(int j = 0; j < pairs[i].length; j++) {
                System.out.print(pairs[i][j] + ",");
            }
            System.out.println();
        }

    }
}
