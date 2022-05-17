package com.zoho;

public class patternProgram60Questions {
    public static void main(String[] args) {
        //Question 5.
        /*int i,j,n;
        System.out.println("Enter the no of lines : ");
        n= scanner.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print((char) (i+64));
            }
            System.out.println();
        }*/

        //for loop.
        /*int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Question 7.
        int n=5;
        for(int i=1,p=1;i<=n;i++,p++){
            for(int j=1;j<=n;j++){
                if ((i==j)||(i+j==n+1)){
                    System.out.print(p +" ");}
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        //Question 50 A.
        /*int n = 9;
        for (int i = 1; i <= n; i++) {
            int p=1;
            for(int j =i;j<=n;j++){
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(p++ +" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(p-- +" ");
            }
            System.out.println();
        }*/

        //Question 50 B.
        /*int n = 9;
        for (int i = 1; i <= n; i++) {
            int p=9;
            for(int j =i;j<=n;j++){
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(p-- +" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }*/

        //  Question 50 C.
        /*int n = 9;
        for (int i = 1; i <= n; i++) {
            for(int j =1;j<=i;j++){
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //  Question 50 D
        /*int n = 9;
        for (int i = 1,p=9; i <= n; i++,p--) {
            for(int j =1;j<=i;j++){
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(p+" ");
            }
            for (int j=i;j<=n;j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }*/

        //  Question 55.

       /* int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1||i==n||j==1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }*/

        //Queston 56.

        /*int n = 4,p=1;
        for(int i = 1; i<=n;i++){
            for(int j =i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }*/

        //Question 58.

     /*   int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for(int j =1; j<i;j++){
                System.out.print("__");
            }
            for(int j =i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j =i; j<n;j++){
                System.out.print("__");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

    }
}
