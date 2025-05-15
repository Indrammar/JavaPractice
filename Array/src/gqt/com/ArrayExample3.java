package gqt.com;

/*Default values of Array
 * int Array=0
 * float array=0.0f
 * double array=00
 * String array=null
 * boolean  array=false
 * 
*/
public class ArrayExample3 {

	public static void main(String[] args) {
		int[] a=new int[5];
		System.out.println(a[2]);//0
		
		char[] c=new char[5];
		System.out.println(c[4]);// we will get 6\00 but we can not see(space will come)
		
		float []  b=new float[5];
		System.out.println(b[0]);//0.0
		
		String[] s=new String[5];
		System.out.println(s[4]);//null 
		
		boolean[] e=new boolean[4];
		System.out.println(e[2]);//false 
		
	}
}
