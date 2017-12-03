package Polymorphism;

public class Overloading {

	int i = 10;
	
	{
		System.out.println("instance block");
	}
	
	{ // we can create n number of instance blocks
		System.out.println("Instrance block 1");
	}
	
	static{
		System.out.println("Static block");
	}
	
	static{ // we can create n number of static blocks
		System.out.println("Static block1");
	}
	
	// method overloading
	public void m1(){
		System.out.println("non static method");
	}
	
	public void m1(int a){
		System.out.println("non static overloaded method"+ a);
	}
	
	public static String m2(){
		return "static method";
	}
	
	public static int m2(int a){ // return type not consider. only method name and args
		return a;                // that is method-signature
	}
	
	// constructor overloading
	Overloading(){
		System.out.println("0 arg constructor");
	}
	
	Overloading(String a){
		System.out.println(a);
	}
	
	public static void main(String[] args){
		Overloading obj = new Overloading("arg constructor");
		obj.m1();
		obj.m1(10);
		System.out.println(Overloading.m2());
		System.out.println(Overloading.m2(20));
		
		// operator overloading
		System.out.println(obj.i + " concate");// one string value must for concate
		System.out.println(obj.i + obj.i); // adding
	}
}
