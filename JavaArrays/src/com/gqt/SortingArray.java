package com.gqt;
import java.util.Arrays;

// wpto sort an array
public class SortingArray {

	public static void main(String[] args) {
		int[] a= {1 ,4,5,6,2,3};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//Predefined approach
	   //Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
