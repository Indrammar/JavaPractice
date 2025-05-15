package com.pattern;

public class HShapePattren {
	    public static void main(String[] args) {
	        int n = 7; // Height of the H

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                
	                // Left and right vertical lines
	                if (j == 0 || j == n - 1) {
	                    System.out.print("*");
	                }
	                // Middle horizontal line
	                else if (i == n / 2) {
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
