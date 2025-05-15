package com.pattern;

public class P6 {
	public static void main(String[] args) {
		//top block
		for(int i=1; i<=5; i++) {
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			for(int j=1; j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//bottom block
		for(int i=4; i>=1; i--) {
			for(int k=1; k<=i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
