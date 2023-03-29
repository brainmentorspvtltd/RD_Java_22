package Arrays2D;

import java.util.LinkedList;
import java.util.List;

public class P4_LuckyNumber {
    public static void main(String[] args) {
        // int arr[][] = {{3,7,8},{9,11,13},{15,16,17}};
        int arr[][] = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> maxCol = new LinkedList<>();
        List<Integer> minRow = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        int minRowE = Integer.MAX_VALUE;
        int maxColE = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                minRowE = Math.min(minRowE, arr[i][j]);
            }
            minRow.add(minRowE);
            minRowE = Integer.MAX_VALUE;
        }

        for(int i = 0; i < arr[0].length; i++) {
            for(int j = 0; j < arr.length; j++) {
                maxColE = Math.max(maxColE, arr[j][i]);
            }
            maxCol.add(maxColE);
            maxColE = Integer.MIN_VALUE;
        }


        for(int each : minRow) {
            if(maxCol.contains(each)) {
                result.add(each);
            }
        }

        System.out.println(result);
    }
}
