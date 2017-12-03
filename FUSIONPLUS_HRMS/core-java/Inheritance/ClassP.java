package Inheritance;

public class ClassP {

	int a;
	
	static int b;
	
	{
		System.out.println("parent instrance block");
	}
	
	static
	{
		System.out.println("parent static block");
	}
	
	ClassP(){
		System.out.println("Parent 0 agrs constructor");
	}
	
	public void m1(){
	 System.out.println("parent m1 method");	
	}
}
