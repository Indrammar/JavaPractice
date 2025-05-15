package com.pattern;

public class BShapePattern {
	public static void main(String[] args) {
        int n = 5; // height of the pattern

        for (int i = 0; i < n; i++) {
            System.out.print("*"); // Left vertical line

            for (int j = 0; j < n; j++) {
                // Top, middle and bottom rows
                if ((i == 0 || i == n / 2 || i == n - 1) && j < 3)// top and bottom ***
                    System.out.print("*");
                
                // Right side of top half
                else if (j == 3 && (i != 0 && i < n / 2) )
                    System.out.print("*");
                
                // Right side of bottom 
                else if (j == n - 2 && (i > n / 2 && i != n - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

