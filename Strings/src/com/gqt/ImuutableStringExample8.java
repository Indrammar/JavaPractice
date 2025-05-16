package com.gqt;

public class ImuutableStringExample8 {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2="SITA";
		String s3="RAMA"+"SITA";
		String s4="RAMA"+"SITA";
		
		if(s3==s4) {
			System.out.println("Strings are equals");
		}
		else {
			System.out.println("Styrings are not equals");
		}
	}

}
