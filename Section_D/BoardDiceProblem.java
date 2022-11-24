import java.util.ArrayList;

public class BoardDiceProblem {

    static ArrayList<String> dicePos(int source , int target){
        if(source == target){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(source> target){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for(int dice = 1; dice<=6; dice++){
            int currentValue = dice + source;
            ArrayList<String> list = dicePos(currentValue, target);
            for(String temp : list){
                finalResult.add(temp + dice);
            }
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(dicePos(0, 10));
    }
}
