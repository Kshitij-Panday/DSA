package recursion.backtracking;

import java.lang.foreign.GroupLayout;
import java.util.ArrayList;

public class Maze {
  public static void main(String[] args) {
    System.out.println(count(3,3));
   path("",3,3);
    System.out.println(pathReturn("",3,3));
  }

  static int count(int row,int col){
    if (row == 1 || col == 1){
      return 1;
    }
    int left = count(row-1,col);
    int right = count(row,col-1);

    return left+right;
  }

  static void path(String p, int row , int col){
    if (row == 1 && col == 1){
      System.out.println(p);
      return;
    }
    if (row > 1){
      path(p+'D', row-1, col);
    }
    if (col > 1){
      path(p+'R', row, col-1);
    }
  }

  static ArrayList<String> pathReturn(String p, int row , int col){
    if (row == 1 && col == 1){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> list = new ArrayList<>();

    if (row > 1){
      list.addAll(pathReturn(p+'D', row-1, col));

    }
    if (col > 1){
      list.addAll(pathReturn(p+'R', row, col-1));
    }
    return list;
  }
}
