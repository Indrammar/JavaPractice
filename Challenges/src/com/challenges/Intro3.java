package com.challenges;

public class Intro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=10;
		
		System.out.println("Before Swapping");
		
		a=a+b; //15
		b=a-b;//5
		a=a-b;//10
		System.out.println("After Swapping:");
		
		System.out.println("a= " +a +  " " + "b= " + b);	

		//with temp swapping
		
		int temp=a;
		a=b;
		b=temp;
		
	}

}
