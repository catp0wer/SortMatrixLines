package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadingFile {

    public int[][] ReadFile(String filePath) {
        
        String line = "";
        int[][]  result = new int[3][3];
        try {
            FileReader inputFile = new FileReader(filePath);
            BufferedReader bufferReader = new BufferedReader(inputFile);
int row = 0;
            while ((line = bufferReader.readLine()) != null) {

                System.out.println(line);
                String [] elements = line.split("\\s+");


                    for(int col = 0; col<result.length;col++){
                        result[row][col]= Integer.parseInt(elements[col]);
                    }
                row++;


            }
            System.out.println("The array from file is: ");
            sortArrayLines.printMatrix(result);
            bufferReader.close();

        } catch (Exception e) {

            String exceptionDetails = e.toString() + "\n";
            StackTraceElement[] trace = e.getStackTrace();
            for (StackTraceElement i: trace) {
                exceptionDetails += i.toString() + "\n";
            }

            System.out.println("Error while reading file line by line:" + exceptionDetails);

        }
        return result;

    }
}
