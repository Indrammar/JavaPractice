package com.gqt;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str="hi how are you?";
		
		StringTokenizer stk =new StringTokenizer(str,("o"));// used to chop the string
		
		while(stk.hasMoreTokens()) // check Weather any tokens are left out in stringTokenize
			{
				System.out.println(stk.nextToken()); // nextToken used to Access the current token
			}
		
	}

}
 
// output

/*   hi h
     w are y
     u?              */ 

