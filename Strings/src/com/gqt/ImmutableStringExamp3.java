package com.gqt;

public class ImmutableStringExamp3 {

	public static void main(String[] args) {
		String s1=new String("RAMA");
		String s2=new String("RAMA");
		
		if(s1==s2) {
			System.out.println("Sytring are equals");
		}else {
			System.out.println("Strings are not equals");
		}

	}
}
//here Strings are not equals bcz we used new keyword to create String , so it creats String in Heap area so  thee
// Two Strings are allowed so references are different
