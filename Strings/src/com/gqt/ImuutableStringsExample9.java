package com.gqt;

public class ImuutableStringsExample9 {

	public static void main(String[] args) {
		String s1="RAMA";
		System.out.println(s1);
		s1.concat("SITA");
		System.out.println(s1);
		
		
		//output to se RAMASITA
		
		String s2 = "RAMA";
		s2 = s2.concat("SITA"); // assign the result
		System.out.println(s2);
	}

}
/*here OUTPUT is 
 * RAMA
 * RAMA
 * why bcz we created a new string SITA it concate like RAMASITA  and this creats on heap area and also one in scp area 
 * and here we did not craete any refernces to the SITA so it will not print and it will late available for 
 * Grabage collector
 * */
