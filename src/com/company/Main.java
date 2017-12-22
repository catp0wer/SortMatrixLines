package com.company;


public class Main {

    public static void main(String[] args) {
        String filePath = "D:\\Git_projects\\SortMatrixLines\\Array.txt";
        ReadingFile my_array = new ReadingFile();
        int[][] readFile = my_array.ReadFile(filePath);

        sortArrayLines sortedArray = new sortArrayLines();
        int[][] result = sortedArray.sort(readFile);
        System.out.println("The final result is: ");
        sortedArray.printMatrix(result);


    }
}