package com.zoho;

public class tryCatchException {
    public static void main(String[] args) {
         int a=10,b=0,c;
        try {
            c=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("from catch block");
           // System.exit(0);

        }
        finally {
            System.out.println("i am from finally block");
        }
    }
}
