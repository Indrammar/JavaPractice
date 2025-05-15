package com.basic;
import java.util.Scanner;
public class UpperCaseToLowerCase {
	public static void main(String[] args) {
		
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word=Scan.next();
		
		if(word.equals(word.toUpperCase())) {
			
			System.out.println("converted"+word.toLowerCase());
		}
		else if(word.equals(word.toLowerCase())) {
			
		System.out.println("converted:"+word.toUpperCase());
		}
		else {
			
			System.out.println("Invaild");
		}
		Scan.close();
	}

}
