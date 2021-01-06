package com.claudiamacea;

import java.util.Scanner;

public class ZeroMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti numarul de linii: ");
        int n = s.nextInt();
        System.out.println("Introduceti numarul de coloane: ");
        int m = s.nextInt();
        int[][] matrix = new int[n][m];
        int [][]newMatrix = new int[n][m];

        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.nextInt();
                newMatrix[i][j] = matrix[i][j];
            }
        }

        ZeroMatrix zero = new ZeroMatrix();

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0) zero.setToZero(i,j,newMatrix);
            }

        zero.printMatrix(matrix);
        System.out.println();
        zero.printMatrix(newMatrix);
    }

    public int[][] setToZero(int x, int y, int[][] matrix){
        for(int i=0;i<matrix[0].length;i++)matrix[x][i]=0;
        for(int i=0;i<matrix.length;i++)matrix[i][y]=0;
        return matrix;
    }

    public void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
