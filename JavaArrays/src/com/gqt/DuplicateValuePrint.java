package com.gqt;
import java.util.Arrays;

public class DuplicateValuePrint {

	public static void main(String[] args) {
		int [] a= {2,4,5,2,5,7,8,8,9};
		//travesing 
		for(int i=0;i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
