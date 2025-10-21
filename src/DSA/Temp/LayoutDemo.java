package DSA.Temp;

import java.awt.*;
import java.awt.event.*;

public class LayoutDemo{
    public static void findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int nSquare = n*n;

        System.out.println(n);
        System.out.println(nSquare);
    }

    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int[][] array = new int[rows][cols];
        findMissingAndRepeatedValues(array);
    }
    
}
