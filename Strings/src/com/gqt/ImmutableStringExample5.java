package com.gqt;

public class ImmutableStringExample5 {

	public static void main(String[] args) {
		
		String s1="RAMA";
		String s2=new String("rama");
		
		if(s1.equals(s2)) //not euqals
		//if(s1.equalsIgnoreCase(s2))//equals
		{
			
			System.out.println("Strings are equals");
		}
		else {
			System.out.println("Strings are not equals");
		}

	}

}
// not equals bcz java is case sensitive