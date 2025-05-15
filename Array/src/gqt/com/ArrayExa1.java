package gqt.com;
import java.util.Scanner;
/*Accept 5 city names from the user and print the city names anbd no.of character
 * of the city
 * use for each loop
*/
public class ArrayExa1 {

	public static void main(String[] args) {
		String[] cityName =new String[5];
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter any 5 city names");
		
		//Storing 5 city names 
		for(int i=0; i <cityName.length; i++) {
			cityName[i]=Scan.next();
		}
		//Printing CityName
		System.out.println();
		System.out.println("City Name  \t OR\t  No.of Characters");
		System.out.println("..............................");
		
		//Printing Length of charachters
		for(String x:cityName) {
			System.out.println(x + "\t \t "+ x.length());
		}
	}

}
