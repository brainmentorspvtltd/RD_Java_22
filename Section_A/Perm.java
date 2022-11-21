import java.util.ArrayList;
public class Perm {

    static ArrayList<String> getPerm(String str){
        // Termination Case
        if(str.length() ==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char singleChar = str.charAt(0);
        String subString = str.substring(1);
        ArrayList<String> newList = new ArrayList<>();
        ArrayList<String> list = getPerm(subString);
        // this loop is for traverse list
        for(int i = 0; i<list.size(); i++){
            // Loop for  Logic Place Before and After
            StringBuffer sb = new StringBuffer(list.get(i));
            int len = sb.length();
            for(int j = 0; j<=len; j++){
                sb = new StringBuffer(list.get(i));
                sb.insert(j, singleChar);
                newList.add(sb.toString());
            } 
            }
        return newList;
    }
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = getPerm(str);
        System.out.println(list);
    }
}
