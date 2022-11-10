import java.util.ArrayList;

class NArmStrong{

    static boolean isArmStrongNumber(int num, int sum, int org){
        if(num ==0){
            if(sum == org){
                return true;
            }
            return false;
        }
        int digit = num%10;
        sum = sum +  digit * digit * digit;
        num = num /10;
        return isArmStrongNumber(num, sum, org);
    }

    static ArrayList<Integer> getAllArmStrong(int n, int i){
        if(i == n){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ArrayList<Integer> list2 = getAllArmStrong(n , i+1);
        // Armstrong number check logic
        if(isArmStrongNumber(i, 0,i)){
            list2.add(i);
        }
        return list2;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = getAllArmStrong(1000, 1);
        System.out.println(list);
        // int arr[]= new int[10];
        // arr[0] = 1;
        // ArrayList<Integer> i = new ArrayList<>();
        // i.add(100); // add at end
    }
}