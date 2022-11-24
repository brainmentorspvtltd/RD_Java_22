import java.util.ArrayList;

public class BoardMaze {

    static ArrayList<String> maze(int row, int col, int endRow, int endCol){
        if(row == endRow && col == endCol){
            ArrayList<String> list =new ArrayList<>();
            list.add("");
            return list;
        }
        if(row>endRow || col>endCol){
            ArrayList<String> list =new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        // Move Down
        ArrayList<String> list = maze(row+1, col, endRow, endCol);
        for(String temp : list){
            finalResult.add(temp + "D");
        }
        // Move Right
        list = maze(row, col+1, endRow, endCol);
        for(String temp : list){
            finalResult.add(temp + "R");
        }
        return finalResult;
    }
    public static void main(String[] args) {
       System.out.println( maze(0, 0, 2, 2));
    }
}
