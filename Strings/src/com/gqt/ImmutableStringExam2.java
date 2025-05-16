package com.gqt;

public class ImmutableStringExam2 {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2="RAMA";
		
		if(s1.equals(s2)) {
			System.out.println("String are equals");
		}else {
			System.out .println("Strings are not equals");
		}
	}

}
