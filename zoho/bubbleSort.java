package com.zoho;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] ar = {15,5,11,23,10};
        for(int i =1;i<ar.length;i++){
            boolean swapped = false;
            for(int j =0;j<ar.length-1;j++){
                if(ar[j]>ar[j+1]){
                    swapped=true;
                    int temp = ar[j];
                    ar[j]= ar[j+1];
                    ar[j+1]=temp;
                }
                }
            if (!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
