package com.zoho;

public class patternProgram {
    public static void main(String[] args) {
        //Patteren Program.

        String n = "Program";
        int b = n.length();
        if (b % 2 != 0) {
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < b; j++) {
                    if (i == j) {
                        System.out.print(n.charAt(i) + " ");
                    } else if (i + j == b - 1) {
                        System.out.print(n.charAt(j) + " ");
                    } else
                        System.out.print("  ");
                }
                System.out.println();
            }

        } else {
            System.out.println("0");
        }
    }
}
