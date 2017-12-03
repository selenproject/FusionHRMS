package Inheritance;

public class ClassC1 extends ClassC{

	ClassC1(int a) {
		super(a);//super class have arguments constructor 
		//child class must declare same args constructor and 
		// call as first statement
		System.out.println("this is parent class declaration");
	}
	
	/*ClassC1(int a, int b){ // super class do not have 0 agrs constructor
	 						// child class does not create own constructor
		System.out.println("kdfkdsjf");
	}*/

	public static void main(String args[]){
		new ClassC1(20);
	}
}
