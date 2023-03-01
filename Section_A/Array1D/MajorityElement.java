import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static void approach_1(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        // System.out.println(map);

        // for(int i : arr) {
        //     System.out.println(i);
        // }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,1,1,1,2,2};
        approach_1(arr);
    }
}
