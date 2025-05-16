package com.gqt;
import java.util.Scanner;
import java.util.StringTokenizer;

/* Accept any sentence from the user count the number of words in th sentense */

public class StringTokenizerExample2 {

	public static void main(String[] args) {
		 
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter ant Sentence:");	
		String str= Scan.nextLine();
		int count=0;
		StringTokenizer stk=new StringTokenizer(str,(" "));
		while(stk.hasMoreTokens()) {
			
		stk.nextToken();
		count++;
		
		}
		System.out.println("No.of words =" + count);
		
		
	
	}

}
