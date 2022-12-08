public class RatInAMaze {

    static int getCount(int maze[][], int row, int col) {
        // rat is on target location
        if(row == maze.length - 1 && col == maze.length - 1) {
            return 1;
        }

        if(row > maze.length - 1 || col > maze.length - 1 || maze[row][col] == 0) {
            return 0;
        }

        int answer = getCount(maze, row + 1, col) + getCount(maze, row, col + 1);
        return answer;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,1,1,1},
            {1,1,0,1},
            {0,1,1,1},
            {0,1,1,1}
        };
        getCount(arr, 0, 0);
    }
}
