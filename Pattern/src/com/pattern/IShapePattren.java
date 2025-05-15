package com.pattern;

public class IShapePattren {
	    public static void main(String[] args) {
	        int n = 5; // Height and width of the I (for symmetry)

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {

	                // Top and bottom rows
	                if (i == 0 || i == n - 1) {
	                    System.out.print("*");
	                }
	                // Middle vertical line
	                else if (j == n / 2) {
	                    System.out.print("*");
	                }
	                else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
