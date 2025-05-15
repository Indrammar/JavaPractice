package com.pattern;

public class CShapePattren{
    public static void main(String[] args) {
        int n = 5; // Height of the C

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                // Top and bottom rows
                for (int j = 0; j < 4; j++) {
                    System.out.print("*");
                }
            } else {
                // Side line only (left side)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

