package recursion.backtracking;

public class AllPaths {
  public static void main(String[] args) {
    boolean[][] board ={
            {true,true,true},
            {true,true,true},
            {true,true,true}
    };
    AllPathRestrictions("",board, 0,0);
  }
  static void AllPathRestrictions(String p, boolean[][] maze, int row, int col) {
    if (row == maze.length - 1 && col == maze[0].length - 1) {
      System.out.println(p);
      return;
    }
    if (!maze[row][col]) {
      return;
    }
    if (row < maze.length - 1) {
      AllPathRestrictions(p + 'D', maze, row + 1, col);
    }
    if (col < maze[0].length - 1) {
      AllPathRestrictions(p + 'R', maze, row, col + 1);
    }
    if (row > 0) {
      AllPathRestrictions(p + 'U', maze, row-1, col);
    }
    if (col > 0) {
      AllPathRestrictions(p + 'L', maze, row, col-1);
    }
  }
}
