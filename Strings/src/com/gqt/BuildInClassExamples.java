package com.gqt;

public class BuildInClassExamples {

	public static void main(String[] args) {
		
		String s1="TarakaRama";
		
		System.out.println(s1.toUpperCase()); // TARAKARAMA
		System.out.println(s1.toLowerCase()); //tarakarama
		
		System.out.println(s1.startsWith("Tara")); //true
		System.out.println(s1.endsWith("ma")); // true
		System.out.println(s1.endsWith("Tara")); // false
		
		System.out.println(s1.contains("kaRa"));//true
		System.out.println(s1.contains("jhsgx")); //false
		
		System.out.println(s1.charAt(8)); // m
		
		System.out.println(s1.indexOf('r')); // 2
		
		System.out.println(s1.indexOf('a')); // it prints first comming a index 1
		System.out.println(s1.lastIndexOf('a')); //9
		
		System.out.println(s1.substring(4)); // it prints kaRama
		System.out.println(s1.substring(4,8)); // it prints kaRa
		
		System.out.println(s1.replaceAll("a", "e")); // TerekeReme
		
	}

}
