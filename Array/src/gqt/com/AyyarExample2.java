package gqt.com;
import java.util.Scanner;

public class AyyarExample2 {

	public static void main(String[] args) {
		int[] n=new int[5];
		Scanner Scan=new Scanner(System.in);
		 int sum=0;
		 
		 //Storing 5 digits
		 System.out.println("Enter any 5 digits");
		 for(int i=0;i<n.length;i++) {
			 n[i]=Scan.nextInt();
			 sum += n[i]*n[i];
		 }
		 System.out.println(sum);
		
		 if(sum%4==0) {
			 System.out.println(sum+ "is devisible by 4");
			 
		 }else {
			 System.out.println(sum + " \t not  devisible by 4");
			 
		 }
	}

}
