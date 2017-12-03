package Besics;

public class BaseClass {
	int i = 0;

	{// instance block
		System.out.println("instance block");
	}

	static { // Static block
		System.out.println("Static Block");
	}

	BaseClass() { // zero arg constructor
		System.out.println("O arg Constructor");
	}

	BaseClass(int i) { // one arg constructor
		this.i = i;
		System.out.println("1 org constructor " + i);
	}

	public static void main(String[] args) {
		BaseClass obj = new BaseClass(); // object creation with reference
											// variable
		new BaseClass(10); // objecy creation with out reference variable
		BaseClass.print(); // calling static method
		obj.print1(); // calling non static method
	}

	public static void print() { // Static method
		System.out.println("Static method");
	}

	public void print1() { // non static method
		System.out.println("non Static Method");
	}
}
