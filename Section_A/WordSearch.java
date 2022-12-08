public class WordSearch {

    static char board[][] = {
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
    };

    static boolean isValid = false;

    public static boolean exist(String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(isMatch(i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isMatch(int row, int col, String word) {
        // Base Case
        if(word.length() == 0) {
            return true;
        }
        if(row < 0 || col < 0 || row == board.length || col == board[0].length || word.charAt(0) != board[row][col]) {
            return false;
        }

        int directions[][] = {
            {0,1},  // right
            {1,0},  // down
            {0,-1}, // left
            {-1,0}  // top
        };

        // mark the path
        board[row][col] = '#';

        for(int direction = 0; direction < directions.length; direction++) {
            int rowDirection = directions[direction][0];
            int colDirection = directions[direction][1];
            isValid = isMatch(rowDirection + row, colDirection + col, word.substring(1));
            if(isValid) {
                break;
            }
        }
        
        // Backtrack
        board[row][col] = word.charAt(0);
        return isValid;
    }

    public static void main(String[] args) {
        String word = "ABCCED";
        boolean res = exist(word);
        System.out.println(res);
    }
}