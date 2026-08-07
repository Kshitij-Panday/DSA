package recursion.backtracking;

import java.util.Arrays;

public class AllPathsBackTracking {
  public static void main(String[] args) {
    boolean[][] board ={
            {true,true,true},
            {true,true,true},
            {true,true,true}
    };
    AllPathRestrictions("",board, 0,0);

    int [][] path = new int[board.length][board[0].length];
    AllPathMatrixPrint("",board,0,0,path,1);
  }
  static void AllPathRestrictions(String p, boolean[][] maze, int row, int col) {
    if (row == maze.length - 1 && col == maze[0].length - 1) {
      System.out.println(p);
      return;
    }
    if (!maze[row][col]) {
      return;
    }
    maze[row][col] = false;
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
    maze[row][col] = true;
  }

  static void AllPathMatrixPrint(String p, boolean[][] maze, int row, int col,int [][] path, int step) {
    if (row == maze.length - 1 && col == maze[0].length - 1) {
      for (int [] arr: path){
        path[row][col] = step;
        System.out.println(Arrays.toString(arr));
      }
      System.out.println(p);
      System.out.println();
      return;
    }
    if (!maze[row][col]) {
      return;
    }
    maze[row][col] = false;
    path[row][col] = step;
    if (row < maze.length - 1) {
      AllPathMatrixPrint(p + 'D', maze, row + 1, col,path,step+1);
    }
    if (col < maze[0].length - 1) {
      AllPathMatrixPrint(p + 'R', maze, row, col + 1,path,step+1);
    }
    if (row > 0) {
      AllPathMatrixPrint(p + 'U', maze, row-1, col,path,step+1);
    }
    if (col > 0) {
      AllPathMatrixPrint(p + 'L', maze, row, col-1,path,step+1);
    }
    maze[row][col] = true;
    path[row][col] = 0;
  }
}
