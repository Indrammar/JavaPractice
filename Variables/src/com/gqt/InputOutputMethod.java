package com.gqt;

// method which accept parameter and also returns output

class Demo{
	public int add(int a, int b) {
		int c=a+b;
		return c;
		
	}
}
public class InputOutputMethod {

	public static void main(String[] args) {
		Demo d= new Demo();
		int result=d.add(5, 6);
		System.out.println("Result :" + result);
		
	}

}
