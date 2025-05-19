package com.gqt;

class Student{
	int sid;
	String Name;
	boolean isGraduate;  //  Instance Variables values can be used  without  Initializing
	char gender;
	
	public void m1() {
		System.out.println("Welcome");
	}
}
 class InstanceLocalVariables {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.sid);
		System.out.println(s.Name);
		System.out.println(s.isGraduate);
		System.out.println(s.gender);
			s.m1();
	}

}
 