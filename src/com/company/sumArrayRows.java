package com.company;

import java.util.ArrayList;


public class sumArrayRows {
    ArrayList<Integer> sumRows = new ArrayList<Integer>();
    public void sumRows(int[][] my_array){
        for(int row=0; row < my_array.length; row++){
            int sum = 0;
            for(int col = 0; col<my_array.length; col++){
                sum+=my_array[row][col];



            }sumRows.add(sum);

        }System.out.println(sumRows);

    }
}
