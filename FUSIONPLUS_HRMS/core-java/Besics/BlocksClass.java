package Besics;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class BlocksClass {
static int i =10;
	{// instance block execute during object creation before execute constructor
	// in instance block we can not create obj and but call static methods.
		i = ++i;
		System.out.println("Instance block"+i);
		BlocksClass.m2();
	}
	
	static{
		System.out.println("Static block"+i);
		BlocksClass obj = new BlocksClass();
		obj.m1();
		BlocksClass.m2();
	}
	
	BlocksClass(){
		System.out.println("0 args constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		BlocksClass obj1 = new BlocksClass();
		obj1.m1();
	}

	public void m1(){
		System.out.println("non static method");
	}
	
	public static void m2(){
		System.out.println("static method");
	}
}
