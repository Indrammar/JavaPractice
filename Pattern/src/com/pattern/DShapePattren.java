package com.pattern;

public class DShapePattren {
	public static void main(String[] args) {
	        int n = 5; // Height of the D

	        for (int i = 0; i < n; i++) {
	            System.out.print("*"); // Left vertical line

	            if (i == 0 || i == n - 1) {
	                // Top and bottom rows — full horizontal
	                for (int j = 0; j < 3; j++) {
	                    System.out.print("*");
	                }
	            } else {
	                // Middle rows — spaces + one star on right
	                for (int j = 0; j < 2; j++) {
	                    System.out.print("  ");
	                }
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
	    }
	}

