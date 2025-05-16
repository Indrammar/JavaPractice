package com.gqt;

public class ImmutableString {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2="RAMA";
		
		if(s1==s2) {
			System.out.println("Refernces are equals");
		}else {
			System.out.println("Refernces are not euqals");
		}
	}
}
/* here RAMA  object is stored in SCP area bcz we did not use new kerword
and in scp area duplicates are not equals*/
//output will be equals