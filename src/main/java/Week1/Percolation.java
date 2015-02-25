package Week1;

import java.util.Arrays;

/**
 * Created by rq36 on 23/02/2015.
 */
public class Percolation {



    public static int[][] Percolation(int n) {// create N-by-N grid, with all sites blocked
        int blocked = 1;
        int open = 0;
        n = 50;
        int[][] grid = new int[n][1];
       System.out.println(Arrays.deepToString(grid));
      //  for (int[] arr : grid) {
      //             System.out.println(Arrays.toString(arr));
      //         }
       // for(int r=0; r<n; r++) {
      //     for(int c=0; c<grid[r].length; c++)
       //        System.out.print(grid[r][c] + " ");
       //    System.out.println();
      //  }


        return grid;
    }

    public void open(int i, int j) {
        if (i != j){
            i = j;
            System.out.println("I assigned to J");
            return;
        }

    }        //S7 open site (row i, column j) if it is not open already

    public boolean isOpen(int i, int j) {
        return true;
    }   // is site (row i, column j) open?

    public boolean isFull(int i, int j) {
        return true;
    }   // is site (row i, column j) full?

    public boolean percolates() {
        return true;
    }  // does the system percolate?
}