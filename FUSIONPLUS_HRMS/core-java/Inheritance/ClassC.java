package Inheritance;

public class ClassC extends ClassP{
    int a;
	
    ClassC(int a) { // child own constructor
		this.a = a; 
	}

	{
		System.out.println("child instance block");
	}
	
	static{
		System.out.println("Child static block");
	}	
	
	public static void main(String[] args){
		ClassC obj = new ClassC(10);
		obj.m1();
	//	new ClassC();
	}
}
