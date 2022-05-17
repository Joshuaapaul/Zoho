package com.zoho;

import java.util.Scanner;

public class sixtyQuestions {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Question 2.

        Scanner scanner = new Scanner(System.in);
        /*
         * System.out.print("type a character : "); char input =
         * scanner.next().charAt(0); for(char i = input; i<='Z';i++) {
         * System.out.print(i); }
         */


        //Question 3.
        /*int number =12345, number1=12345, reverse=0;

        while(number>0) {
            reverse = (reverse*10)+number%10;
            number =number/10;
        }
        int result = number1-reverse;
        System.out.println(result);*/

        //  Question 12.

        /*float number= 7.50f;
        System.out.println(number);*/

        //  Question 13.

        /*int a=20;
        int area= a*a;
        System.out.println(area);*/

        //  Question 14.

        /*int l=15,b=10;
        int area = l*b;
        System.out.println(area);*/

        //  Question 15.

        /*final double PI=3.14,area;
        int r=4;
        area = PI*r*r;
        System.out.println(area);*/

        //  Question 18 .

        //int a=2,b=6,c;      //A
        /*c=++a-b--;
        System.out.println(c);*/

        /*int d=a%b++;         //B
        System.out.println(d); */

        /*a*=b+5;                //C
        System.out.println(a);*/

        /*int x=69>>>2;              //D
        System.out.println(x);*/

        //  Question 19.

        /*int a=28,b=1;
        a+=a++ + ++a + --a + a--;
        System.out.println(a);*/

        //  Question 20.

        /*int x=0;
        x = x++ * 2 + 3*--x;
        System.out.println(x);*/

        //  Question 21.

        /*int y = 10,z;
        z= (++y*(y++ +5));
        System.out.println(z);*/

        //  Question 23.

       /* int x=5,x1;               //compilation error.
        x1= ++x --x++ + --x;
        System.out.println(x1);*/

        //  Question 24.

        /*int a = 'B';
        System.out.println(a);*/

        //  Question 25

       /* int a =25, b=4;
         int quotient = a/b;
         int reminder = a%b;
        System.out.println(quotient);
        System.out.println(reminder);*/

        //  Question 26.

        /*long a = 123456789;
        System.out.println(a);*/

        // Question 27.

       /* int a=5,b=4,c=a;
        a=b;
        b=c;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);*/

        // Question 28.

        /*System.out.print("Enter a number : ");
        int input = scanner.nextInt();

        if (input%2==0) System.out.println("Even Number");
        else System.out.println("Odd Number");*/

        //  Question 29.

        /*System.out.print("Enter a character : ");
        char ch = scanner.next().charAt(0);

        if (ch == 'A' || ch == 'E' || ch=='I' || ch=='O' || ch=='U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");*/

        //  Question 30.

        /*int a =10,b=20,c=25;

        if (a>b && a>c)
            System.out.println("Largest number is a="+a);
        else if (b>a && b>c)
            System.out.println("Largest number is b="+b);
        else
            System.out.println("Largest number is c="+c);*/

        //  Question 32.

        /*System.out.print("Enter a positive or negative number :");
        int input= scanner.nextInt();
        if (input>0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");*/

        //  Question 33.

        /*System.out.print("Enter a text or symbol :");
        char c= scanner.next().charAt(0);
        if (c>='a'&& c<='z' || c>='A' && c<='Z')
            System.out.println("Alphabet");
        else
            System.out.println("Not an Alphabet");*/

        //  Question 34.

        /*int n,sum=0;
        System.out.print("Enter a number :");
        int input = scanner.nextInt();
        for(int i=1;i<=input;i++){
            sum=sum+i;
        }
       System.out.println(sum);
        int largestDigit=0;

        while(sum>0){
            int number=sum%10;
            if(number>largestDigit)
            largestDigit=number;
            sum=sum/10;
        }
        System.out.println(largestDigit);*/

        //  Question 35.

        /*int n =5,fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);*/

        //  Question 36.

        /*int [] arr={1,2,3,4,5,6,7,8};

        for(int i=1;i<arr.length;i=i+2){
            System.out.println(arr[i]);
        }*/

        //  Question 37.

        /*int [] arr={1,2,3,4,5,6,7,8};

        for(int i=0;i<arr.length;i=i+2) {
            System.out.println(arr[i]);
        }*/

        //  Question 38,39.

        /*int arr[]={1,2,3,4,5,6};
        int largest=arr[0];
        int smallest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest) largest=arr[i];
            if(arr[i]<smallest) smallest=arr[i];
        }
        System.out.println(largest);
        System.out.println(smallest);*/

        //  Question 40.

        /*int []arr= {2,4,6,8,10};
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }*/

        //  Question 41.

        /*int[] arr={10,20,30,40};
        int[] copy=arr;
        for(int i=0;i<copy.length;i++)
        System.out.println(copy[i]);*/

        //  Question 42.
        /*int count=0;
        int[] arr={1,2,2,3,4,4,5,2,6};
        for(int i=0;i<arr.length;i++){
            if (arr[i]-1==arr[i]) {
                count++;
            }
        }
        System.out.println(count);*/

        //  Question 44.

        /*int[] arr = {1,2,2,3,4,5,4};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }*/

        //  Question 45.

        /*int sum=0;
        int[] arr={1,4,6,7,9,8};
        for(int i=0;i<arr.length;i++){
            sum= sum+arr[i];
        }
        System.out.println(sum);*/

        //  Question 51.

        /*int a=12345;
        while(a>0) {
            int b = a % 10;
            System.out.print(b);
            a = a / 10;
        }*/
    }
}
