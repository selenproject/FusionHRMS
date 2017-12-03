package Besics;

public class ConstractorClass {

	/*
	Note: a constructor does not call itself and called constructor 
	1. calling another constructor using "this();" must be first statement
	2. calling another constructor using creating instance anywhere
	*/

	ConstractorClass(){
		//this(10); // calling called constructor
		System.out.println("zero arg constructor");
		
		/*ConstractorClass obj = new ConstractorClass(10); // calling called constructor
		obj.m2(); // calling non static method
		ConstractorClass.m1(); // calling static method	
		 */
	}
	
	ConstractorClass(int a){//constructor overloading
		//this(); // constructor call once any constructor. does not call twice
		System.out.println("1 arg constructor");
		ConstractorClass obj1 = new ConstractorClass(); // constructor create object
		obj1.m2(); // calling non static method
		ConstractorClass.m1(); // calling static method	
	}
	
	public static void main(String[] args) {
		new ConstractorClass(10);
	}
	
	public static void m1(){
		System.out.println("Static method");
	}
	
	public void m2(){
		System.out.println("non staic method");
	}
} 
