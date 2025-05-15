package com.basic;
import java.util.Scanner;

public class Numbers{
	public static void main(String[] args) {
		
     Scanner Scan =new Scanner(System.in);
     System.out.print("Enter A first number:");
     int a=Scan.nextInt();
     System.out.print("Enter a second number:");
     int b=Scan.nextInt();
     int c;
     //Addition
     c=a+b;
     System.out.println(a + "+"  + b + "=" + c);
     Scan.close();
	}

}
