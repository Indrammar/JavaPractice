package com.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicit TypeCasting
		byte b=45;
		int i=b;
		System.out.println(i);		
		
		//Explicit Type Casting
		double a=888.088;
		int k=(int)a;
		System.out.println(k);
		
		long n=7777l; //8byte
		float c=n;   //4byte but still its a implicit TypeCasting
		System.out.println(c);
	}

}
