package Abstraction;

public class ChildClass1 extends ChildClass{
//if extends childClass, implements remaining unimplemented methods only
	// if extends ParentClass, implements all unimplemented methods
	@Override
	public void m2(){
		System.out.println("abstract m2 method");
	}
	public static void main(String[] args) {
		ParentClass obj = new ChildClass1();
		obj.m1();
		obj.m2();
		obj.m3();
		//obj.m4(); m4 is not parent method
	}
}
