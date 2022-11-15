import java.util.ArrayList;

public class ArmStrongN {

    static boolean isArmStrong(int num , int org, int sum){
        if(num==0){
            if(org == sum){
                return true;
            }
            return false;
        }
        int digit  = num % 10;
        sum = sum + (digit * digit * digit);
        boolean isResult = isArmStrong(num/10 , org, sum);
        return isResult;
    }

    static ArrayList<Integer> getAllArmStrong(int start, int range){
        if(start > range){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ArrayList<Integer> list = getAllArmStrong(start+1, range);
        if(isArmStrong(start, start, 0)){
            list.add(start);
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = getAllArmStrong(1, 500);
        System.out.println(l);
    }
}
