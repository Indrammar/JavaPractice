package com.gqt;

public class LocalVariableExam2 {

	public static void main(String[] args) {
		int a=10;
		int b;
		
		if(a==10) {
			b=25;
		}
		System.out.println(a); // 10
		System.out.println(b);  // error
		
	}

}
