package com.gqt;

class Dog{
	String Name;
	String Bread;
	int cost;
	
	public void bark() {
		System.out.println("Dog is Barking");
	}
	public void eat() {
		System.out.println("Dog is Eating");
	}
	public void sleep() {
	System.out.println("Dog is sleeping");
    }
}

public class ObjectOrientatonDemo {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();
		d.sleep();
		
		System.out.println(d.hashCode());
	}

}
