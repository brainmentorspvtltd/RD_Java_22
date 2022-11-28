class NQueen{


    // TO check can we place a Queen
    static boolean canIPlaceAQueen(int row, int col){
            // Check on Above row
            for(int i = row; i>=0; i--){
                if(board[i][col]){
                    return false;
                }
            }

            // Check in Right Diagonal
            for(int i = row , j=col; i>=0 && j<board.length; i--, j++){
                if(board[i][j]){
                    return false;
                }
            }

            // Check in Left Diagonal
            for(int i = row , j=col; i>=0 && j>=0; i--, j--){
                if(board[i][j]){
                    return false;
                }
            }
            return true;
    }

    static final int N  = 9;
    static boolean board [][] = new boolean[N][N];
    // this function will return the number of possiblities
    static int nQueenPlacement(int row, int currentCol){
        int count = 0;
        // Termination Case
        if(row == board.length){
            return 1;
        }

        // Queen can be place on any col
        for(int col = 0 ; col<board.length;col++){
            // On Current Row and Current Col , Place the Queen
        // But Before Place a Queen we need to check can we place the queen
            if(canIPlaceAQueen(row, col)){
                board[row][col] = true; // Queen Place
                // Move to the Next Row
                 count = count +  nQueenPlacement(row+1, col);
                 board[row][col] =false; // BackTrack and Undo It
                }
    }
    return count;
    }
    public static void main(String[] args) {
        int count = nQueenPlacement(0, 0);
        System.out.println(count);
    }
}