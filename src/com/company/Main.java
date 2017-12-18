package com.company;


public class Main {

    public static void main(String[] args) {
        sortArrayLines sortedArray = new sortArrayLines();
        int[][] result = sortedArray.sort();
        System.out.println("The final result is: ");
        sortedArray.printMatrix(result);


    }
}