package com.pattern;

public class aShapePattren {

	public static void main(String[] args) {
		   // Height of the A

		        for (int i = 0; i <=6; i++) {
		            // Print leading spaces
		            for (int j = 0; j < 6 - i; j++) {
		                System.out.print(" ");
		            }

		            // Print A's and spaces in between
		            for (int j = 0; j <= i; j++) {
		                if (j == 0 || j == i || i == 6 / 2) {
		                    System.out.print("A ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.println();
		        }
	}

}
