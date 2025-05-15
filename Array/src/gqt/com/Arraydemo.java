package gqt.com;

import java.util.Arrays;

public class Arraydemo {

	public static void main(String[] args) {
		
		int[] a= {10,20,30};
		System.out.println(a);// error
		System.out.println(Arrays.toString(a));//using arrayToString we can print
		
		for (int i = 0; i < a.length; i++) {
		    System.out.println(a[i]);//using for loop can print
		}
		 for(int num:a) {
			 System.out.println(num);// using enhance for loop
		 }
		 
		 
		float[] height=new float[6];
		System.out.println(height.length);
	}

}
