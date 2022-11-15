import java.util.ArrayList;

public class ArraySearch {
    static ArrayList<Integer> search(int arr[], int searchEle, int index){
           if(arr.length == index) {
            ArrayList<Integer> l = new ArrayList<>(); 
            return l;
            // Array End
           }   
           
        // Array Traverse 
            ArrayList<Integer> l  = search(arr, searchEle, index+1);
            if(arr[index] == searchEle){
                l.add(index);
            }
            return l;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2,10,20,30,10,2,90,10,100,10};
        int search = 10;
        ArrayList<Integer> list = search(arr, search, 0);
        System.out.println(list);
    }
}
