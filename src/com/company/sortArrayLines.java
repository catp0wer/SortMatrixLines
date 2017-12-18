package com.company;

import java.util.Arrays;

public class sortArrayLines {
    public void printMatrix(int[][] my_array){
        for(int i=0;i<my_array.length;i++){
            for(int j=0;j<my_array.length;j++){
                System.out.format("%d ", my_array[i][j]);
            }System.out.println();
        }

    }
    public int[][] sort() {
        int[][] my_array = {{5, 9, 1},
                            {1, 3, 4},
                            {0, 1, 2}};
        boolean existChanges = true;
        sumArrayRows my_object = new sumArrayRows();
        int[] temp;
        while (existChanges) {
            for (int i = 0; i < my_array.length - 1; i++) {
                existChanges = false;
                if (my_object.sumLines(my_array[i]) > my_object.sumLines(my_array[i + 1])) {
                    System.out.println("Switching " +my_object.sumLines(my_array[i]) + " with " +my_object.sumLines(my_array[i + 1]));
                    temp = my_array[i];
                    my_array[i] = my_array[i + 1];
                    my_array[i + 1] = temp;
                    existChanges = true;
                    printMatrix(my_array);
                }
                     //   System.out.println(java.util.Arrays.toString(my_array[i]));
            }


        }return my_array;
    }

}

