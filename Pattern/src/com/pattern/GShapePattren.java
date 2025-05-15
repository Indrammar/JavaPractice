package com.pattern;

public class GShapePattren {
	    public static void main(String[] args) {
	        int n = 5; // Height of the G

	        for (int i = 0; i < 5; i++) {
	            if (i == 0 || i == n - 1) {
	                // Top and bottom rows
	                for (int j = 0; j < 4; j++) {
	                    System.out.print("*");
	                }
	            } else if (i == n / 2) {
	                // Middle row with a gap on the left
	                System.out.print("*");
	                for (int j = 1; j < 2; j++) {
	                    System.out.print("  ");
	                }
	                System.out.print("**");
	            } else if (i > n / 2) {
	                // Lower right curve
	                System.out.print("*   *");
	            } else {
	                // Upper left side
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	}

