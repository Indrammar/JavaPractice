package com.basic;

/*public class PrePostIncreament {
	public static void main(String[] args) {
		
		int a=10;
		++a;//Pree Increment
		System.out.println(a)	;
		
		a++; //post increment
		System.out.println(a);
		
		}

}*/

  /* public class PrePostIncreament {
	public static void main(String[] args) {
		
		int a;
		a=5;
		int b;
		b=++a;
		System.out.println(a);//6
		
		System.out.println(b);//6
		
	}
}
*/



public class PrePostIncreament {
	public static void main(String[] args) {
		int a;
		a=11;
		int b;
		b=21;
		int c=++a + ++b + ++a + b++  - --a + b--;
		System.out.println(a);//13
		
		System.out.println(b);
		System.out.println(c);
				
	}
}



