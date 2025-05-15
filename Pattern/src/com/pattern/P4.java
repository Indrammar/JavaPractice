package com.pattern;

public class P4 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 ||j==1 || j==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		 System.out.println();
		 System.out.println();
		 
		 for(int l=1;l<=5;l++) {
			 for(int m=1; m<=5;m++) {
				 if(l==3 || m==3) {
					 System.out.print("* ");				 
				 }else {
					 System.out.print("  ");
				 }		 
			 }			
			 System.out.println(  );
		 }
	}

}

