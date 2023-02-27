// package Arrays1D;

import java.util.HashMap;

public class OddElement {

    static void approach_1(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        // int hash[] = new int[100];
        // for(int i = 0; i < n; i++) {
        //     hash[arr[i]] = ++hash[arr[i]];
        // }
        // for(int i = 0; i < hash.length; i++) {
        //     if(hash[i] == 1) {
        //         System.out.println("Element is : " + i);
        //         break;
        //     }
        // }

        for(int i = 0; i < n; i++) {
            if(map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i],map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        int []arr = {1,1,2,2,3,3,4,5,5,6,6};
        approach_1(arr);
    }
}
