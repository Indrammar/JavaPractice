package com.challenges;
import java.util.Scanner;

public class Intro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter Any Number:" );
		int num =Scan.nextInt();
		boolean isPrime=true;
		if(num <=1) {
			isPrime=false;
		}else {
			for(int i=2;i<=num/2;i++) {
				if(num % i==0){
					isPrime=false;
					break;
				}
			}
	
		}
		if(isPrime) {
			System.out.println(num + "is primeNumber");
		}else {
			System.out.println(num+ "is not pime");
		}
		Scan.close();
	}
}
