package com.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRotations {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        int rotations = sc.nextInt();
        for(int i=0;i< rotations;i++){
            int j=0,firstElement = arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j] = firstElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}
