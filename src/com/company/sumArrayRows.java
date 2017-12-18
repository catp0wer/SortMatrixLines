package com.company;

public class sumArrayRows {

    public int sumLines(int[] my_array){
        int sum = 0;
        for(int row=0; row < my_array.length; row++) {
            sum += my_array[row];
        }
        return sum;

    }
}
