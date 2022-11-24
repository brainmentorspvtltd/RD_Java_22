import java.util.ArrayList;

public class BoardMazeProblem {

    static ArrayList<String> mazePos(int startRow,int startCol, int endRow, int endCol){
        if(startRow== endRow && startCol == endCol){
            ArrayList<String> list =new ArrayList<>();
            list.add("");
            return list;
        }
        if(startRow>endRow || startCol>endCol){
            ArrayList<String> list =new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        // Start with Down
        ArrayList<String> list = mazePos(startRow+1, startCol, endRow, endCol);
        for(String temp : list){
            finalResult.add(temp + "D");
        }
        // Start with Right
        list =  mazePos(startRow, startCol+1, endRow, endCol);
        for(String temp : list){
            finalResult.add(temp + "R");
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(mazePos(0, 0, 2, 2));
    }
}
