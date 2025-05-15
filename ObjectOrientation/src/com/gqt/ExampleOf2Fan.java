package com.gqt;

class Fan{
	String color;
	int noOfWings;
	int price;
	
	public void rotate() {
		System.out.println("Fan is rotating");
		
	}
	public void blowsAir() {
		System.out.println("fan is blowing the Air");
	}
	public void stop() {
		System.out.println("Fa stop rotating when its switch off");
	}
}

public class ExampleOf2Fan {

	public static void main(String[] args) {
		Fan f1=new Fan();
		Fan f2=new Fan();
		
		f1.rotate();
		f1.stop();
		f1.blowsAir();
		
		System.out.println(f1.hashCode());
		
		System.out.println(f2.hashCode());
		

	}

}
