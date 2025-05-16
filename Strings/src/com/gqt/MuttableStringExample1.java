package com.gqt;

public class MuttableStringExample1 {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("RAMA");
		System.out.println(s);//RAMA
		
		s.append("SITA");
		System.out.println(s);//RAMASITA
		
	}

}
