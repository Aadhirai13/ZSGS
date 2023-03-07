package com.zsgs.febendevaluation;

import java.util.Scanner;

public class NumericalPatternPrint {
    static public void main(String args[]){
        int input = 12;
        int[][] array = new int[input][];
        for(int row = 1;row <= input;row++){
            array[row-1] = new int[row];
        }
        int num = 1;

        for(int row = 0;row < input;row++){
            for(int col = row;col < input;col++)
                array[col][row] = num++;
        }

        for(int i = 0;i < input;i++){
            for(int j = 0;j < array[i].length;j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
