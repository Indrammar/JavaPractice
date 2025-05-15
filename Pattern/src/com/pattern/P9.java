package com.pattern;

public class P9 {
	public static void main(String[] args) {
		char count='A';
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)(64+i) + " ");	
				}
			System.out.println();

		}
		
		System.out.println();
		
		for(int m=1; m<=5; m++) {
			for(int n=1; n<=m; n++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

}
