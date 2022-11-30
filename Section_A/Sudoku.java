public class Sudoku {
    static int[][] board = {{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
    static void print(){
        for(int i = 0; i<board.length; i++){
            for(int j = 0 ; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean canIPlace(int row, int col, int value){
        // Check in Row
        for(int i = 0; i<board.length; i++){
            if(board[row][i]== value){
                return false;
            }
        }
        // Check in Col
        for(int i = 0 ; i<board.length; i++){
            if(board[i][col] == value){
                return false;
            }
        }
        // Check in SubGrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for(int i = startRow; i<startRow+3; i++){
            for(int j = startCol ; j<startCol+3; j++){
                if(board[i][j] == value){
                    return false;
                }
            }
        }
        return true; 
    }

    static boolean solveSudoku(int row, int col){
        // check if cell reach to end col
        if(col == board.length){
            // move to next row and set col 0
            row = row + 1;
            col = 0;


        }
        // if row reach to end
        if(row == board.length){
            return true;
        }
        // if cell is not empty 
        if(board[row][col]!=0){
            return solveSudoku(row, col+1); // Move to Next cell
        }
        // If Cell is Empty (Place b/w 1 to 9)
        // Before place check can i place
        for(int i = 1; i<=9; i++){
            if(canIPlace(row, col, i)){
                board[row][col] = i; // Place the Value in Cell
                boolean result = solveSudoku(row, col+1);
                if(result){
                    return result;
                }
                // Undo the cell value
                board[row][col] = 0; // BackTracking
            }
        }
        return false;

    }

    public static void main(String[] args) {
        boolean result = solveSudoku(0, 0);
        System.out.println(result);
        print();
    }
}
