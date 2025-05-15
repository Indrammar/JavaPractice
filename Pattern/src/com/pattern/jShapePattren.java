package com.pattern;

public class jShapePattren {
	    public static void main(String[] args) {
	        int n = 5; // Height of the J

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {

	                // Top horizontal line
	                if (i == 0) {
	                    System.out.print("*");
	                }
	                // Vertical line in the center
	                else if (j == n / 2 && i != n ) {
	                    System.out.print("*");
	                }
	                // Bottom curve (left side of the hook)
	                else if (i == n - 1 && j <= n / 2) {
	                    System.out.print("*");
	                }
	                // Left corner curve
	                else if (i >= n - 3 && j == 0) {
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

