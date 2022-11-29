class NQueen{

    static final int N = 9;
    static boolean board[][] = new boolean[N][N]; // All are false

    static boolean canIPlaceAQueen(int row, int col){
        // Check in Above Row
        for(int i=row; i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }
        // Check Left Diagonal
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j]){
                return false;
            }
        }
        // Check Right Diagonal
        for(int i=row, j=col; i>=0 && j<N; i--, j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }

    static int countWays(int row){
        int count = 0;
        // Termination Case
        if(row == board.length)
        {
            return 1;
        }
        // Check in Each Row and Each Col can i Place a Queen
        // when column loop exhaust , it means recursion call
        // (current call exhaust) so it means stack fall 
        //(We do BackTracking)
        for(int col = 0; col<N; col++ ){
            if(canIPlaceAQueen(row, col)){
                board[row][col] = true; // Queen Placed
                 count = count + countWays(row+1); 
                 // STack Fall
                 board[row][col] = false; // Queen Remove
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int count = countWays(0);
        System.out.println(count);
    }
}