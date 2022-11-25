class NQueen{
    static int n = 8;
    static boolean board[][] = new boolean[n][n];

    static boolean canWePlaceQueen(int row, int col){
        // Check from Up
        for(int i = row; i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }
        // Left Diagonal 
        for(int i = row, j = col; i>=0 && j>=0; i--, j--){
            if(board[i][j]){
                return false;
            }
        }
        // Right Diagonal
       for(int i = row, j = col; i>=0 && j<board.length; i--, j++){
            if(board[i][j]){
                return false;
            }
        }

        return true;

    }

    static int countNumberOfWays(int row){
        int count = 0;
        if(row == board.length){
            return 1;
        }

        for(int col = 0 ; col<board.length; col++){
            if(canWePlaceQueen(row, col)){
            board[row][col] = true;
            count = count + countNumberOfWays(row+1);
            board[row][col] = false;
            }
        }

        return count;


    }
    public static void main(String[] args) {
        int count = countNumberOfWays(0);
        System.out.println(count);
    }
}