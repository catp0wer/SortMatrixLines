package com.company;


public class Main {

    public static void main(String[] args){

        int [][] my_array = {{3,5,20},
                             {1,0,4},
                             {0,2,1}};

        sumArrayRows my_object = new sumArrayRows();
        my_object.sumRows(my_array);
    }
}
