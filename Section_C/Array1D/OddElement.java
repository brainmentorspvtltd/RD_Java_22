import java.util.HashMap;
import java.util.Map;

public class OddElement {
    
    static void approach_1(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) ==  null) {
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
    
    static void approach_2(int arr[]) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println("Odd Element : " + ans);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5};
        approach_1(arr);
        approach_2(arr);
    }
}
