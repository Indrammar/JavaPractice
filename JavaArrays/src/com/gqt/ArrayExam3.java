package com.gqt;
import java.util.Arrays;;

public class ArrayExam3 {

	public static void main(String[] args) {
		
		int[] a= {1,2,3};//3
		int[] b= {4,5,6};//3
		
		int[]c=new int[a.length+b.length];//6
		
		for(int i=0;i<a.length; i++) {
			c[i]=a[i];
		}//c{1,2,3,0 0 0)
		
		for(int i=0; i<b.length; i++) {
			c[i+a.length]=b[i];
		}///{1,2,3,4,5,6}
		
		//printing the value
		System.out.println(Arrays.toString(c));
		
	}

}
