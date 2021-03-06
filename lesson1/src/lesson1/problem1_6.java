/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author yeswanth
 * Problem statement:
 * Given a matrix of size (n*n), turn the matrix 90 degrees rightwards.
 * method details:
 * 1.transform: given a n*n matrix, this method will turn it 90 degrees.
 * 
 */
public class problem1_6 {
     public void transform(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=1;(i+j)<matrix.length;j++){
                int temp=matrix[i+j][i];
                matrix[i+j][i]=matrix[i][i+j];
                matrix[i][i+j]=temp;
            }
        }
        
        for(int i=0;i<matrix.length/2;i++){
            int k=i;
            int l=matrix.length-(k+1);
            for(int j=0;j+k<matrix.length;j++){
                int temp=matrix[j][k];
                matrix[j][k]=matrix[j][l-k];
                matrix[j][l-k]=temp;
                
            }
        }
    }
}
