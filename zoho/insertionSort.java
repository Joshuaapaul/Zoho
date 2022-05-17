package com.zoho;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
         int[]arr = {2,5,17,9,7};
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        // Sorting using sort method.
        /*int[] arr = {23,40,19,67,92};
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/
    }
}
