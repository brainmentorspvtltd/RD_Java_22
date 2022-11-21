import java.util.ArrayList;
public class SubSeq {

    static ArrayList<String> getSubSeq(String str){
        // Termination Case
        if(str.length() ==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char singleChar = str.charAt(0);
        String subString = str.substring(1);
        ArrayList<String> newList = new ArrayList<>();
        ArrayList<String> list = getSubSeq(subString);
        // Old List Traverse
        for(int i = 0; i<list.size(); i++){
            newList.add(list.get(i)); // Not Include
            newList.add(singleChar + list.get(i)); // Include
        }
        return newList;
        //return null;
    }
    public static void main(String[] args) {
        String str = "amit";
        ArrayList<String> list = getSubSeq(str);
        System.out.println(list);
    }
}
