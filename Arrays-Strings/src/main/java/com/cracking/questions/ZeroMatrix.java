package com.cracking.questions;

public class ZeroMatrix {
    public int [][] zeroMatrix(int [][] matrix){
        int rowZeros = matrix.length;
        int colZeros = matrix[0].length;
        int[][] zeroMatrix = new int[rowZeros][colZeros];

        if(matrix.length == 1){
            return matrix;
        }
        boolean [] zeroRows = new boolean[rowZeros];
        boolean [] zeroCols = new boolean[colZeros];

        //    o(m)
        for(int i = 0; i< rowZeros; i++){
            if(matrix[i][0] == 0)
            {
               zeroRows[i] = true;
            }
        }
        //    o(n)
        for(int i = 0; i< colZeros; i++){
            if(matrix[0][i] == 0)
            {
                zeroCols[i] = true;
            }
        }
        return zeroMatrix;
        //test commit for contribution
        //test2 for contribution problem
    }
}
