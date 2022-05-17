package com.zoho;

import java.util.Scanner;

public class checkingVowels {
    public static void main(String[] args) {

        // Checking vowels using if else.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter an alphabet :");
        char vowel = input.next().charAt(0);
        if (vowel == 'A' || vowel == 'E' || vowel =='I' || vowel =='O' || vowel =='U')
            System.out.println("The entered alphabet "+vowel+" is a vowel");
        else
            System.out.println("Not a vowel");
    }


}
