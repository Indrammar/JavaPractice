package com.gqt;

public class ImmutableStringsExample7 {

	public static void main(String[] args) {
		
		String s1="RAMA";
		String s2="SITA";
		String s3=s1+s2;
		String s4=s1+s2;
		
		if(s3==s4) {
			System.out.println("Strings are equals");
		}
		else {
			System.out.println("Strings are not euqlas");
		}
		
		
	}

}
