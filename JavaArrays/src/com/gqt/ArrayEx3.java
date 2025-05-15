package com.gqt;

import java.util.stream.Stream;

//how to traverse an array

public class ArrayEx3 {

	public static void main(String[] args) {
		
		String[] s1= {"indu","chandu", "bindu"};
		
		System.out.println("==========Approach1========");
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		
		System.out.println("=========Approach2=========");
		for(String name :s1) {
			System.out.println(name);
		}
			
			System.out.println();
			//System.out.println("=========Approach3=========");
			//Stream.of(s1).forEach(name -> System.out.println(s1));
		
			//Reverse print 
			for(int i=s1.length-1 ;i>=0;i--) {
				System.out.println(s1[i]);
			
		}
	}

}
