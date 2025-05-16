package com.gqt;

public class ImuutableStringExample4 {

	public static void main(String[] args) {
		String s1= "RAMA";
		String s2=new String("RAMA");
		
		if(s1==s2) {
			System.out.println( "Strings are  equals");
		}else {
			System.out.println("Strings are not equals");
		}
	}

}
//here s1 will create on scp area and s2 creates on heap area and one in scp are and here we already created s1 in scp area
// so duplicates are not create in scp area so one in heap area and one in scp area 
// and here we are comparing refernces not contents so Strings are not equals
