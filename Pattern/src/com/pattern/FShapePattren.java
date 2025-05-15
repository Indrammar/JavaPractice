package com.pattern;

public class FShapePattren {
	    public static void main(String[] args) {
	        int n = 5; // Height of the E

	        for (int i = 0; i < n; i++) {
	            if (i == 0 || i == n / 2 ) {
	                // Top, middle, and bottom rows — full row of stars
	                for (int j = 0; j < 4; j++) {
	                    System.out.print("*");
	                }
	            } else {
	                // Left vertical line only
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	}


