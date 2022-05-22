package com.zoho;

public class transposeMatrix {
    public static void main(String[] args) {

        //Showing transpose of matrix.
        int [][] a ={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int [][] transpose = new int[3][3];

        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }

        System.out.println("After transpose");

        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j] = a[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
