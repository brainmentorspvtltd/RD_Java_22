import java.util.ArrayList;

public class Search {
    static ArrayList<Integer> search
    (int arr[], int index, int len , int element){
        //return null;
        if(index == len){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }

        ArrayList<Integer> list = search(arr, index+1, len, element);
        if(arr[index]== element){
            list.add(index);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,8,2,9,2,7,2};
        int search = 2;
        ArrayList<Integer> list = search(arr, 0, arr.length, search);
        System.out.println(list);
    }
}
