package Abstraction;

public abstract class ChildClass extends ParentClass{

	// child class must implement all abstract methods of parent class
	// or child also must be abstract class
	
	public static void main(String[] args) { // abstract class contains main method
	//ParentClass p = new ChildClass(); we cannot create obj for abstract class 
	}
	
	@Override
	public void m1() { 
	System.out.println("abstract m1 method");	
	}
	
	public void m4(){
		System.out.println("m4 method");
	}

}
