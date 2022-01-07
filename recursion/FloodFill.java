package recursion;

public class FloodFill {
    public static void main(String[] args) {
        //floodFill(maze, row, col, ans, visited);
    }

    static void floodFill(int[][] maze, int row, int col, String ans, boolean[][] visited) {
        if(row<0 || col<0 || row==maze.length || col==maze[0].length || maze[row][col]==1) {
            return;
        }

        if(row==maze.length-1 && col==maze[0].length-1) {
            System.out.println(ans);
            return;
        }
        visited[row][col]=true;
        floodFill(maze, row-1, col, ans+"t", visited);
        floodFill(maze, row, col-1, ans+"l", visited);
        floodFill(maze, row+1, col, ans+"d", visited);
        floodFill(maze, row, col+1, ans+"r", visited);
        visited[row][col]=false;

    }
}
