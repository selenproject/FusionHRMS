package Besics;

public class MethodsClass {

	public static void m1(){
		System.out.println("Static method");
	}
	
	public void m2(){
		MethodsClass.m1();
		m1();//static method
		m4();// non static method
		System.out.println("non Static method");
	}
	
	public static int m3(){
		MethodsClass obj = new MethodsClass();
		System.out.println("Static int mentod");
		m1(); //static method
		obj.m2(); // non static method
		return 10;
	}
	
	public int m4(){
		System.out.println("non static int method");
		return 4; // return must be last state and one one return in method
	}

	public void m5(int a){
		System.out.println("one arg non static method"+a);
	}
	
	public static void m6(int a){
		System.out.println("Static one arg method"+a);
	}
	
	public int m7(int a){ // generic method
		System.out.println("non static one arg and return method");
		return a;
	}
	
	public static int m8(int a){ //generic method
		System.out.println("static one arg and retrun method");
		return a;
	}
	
	public static void main(String[] args) {
		MethodsClass.m1();
		int a = MethodsClass.m3();
		System.out.println("static method int return "+a);
		MethodsClass.m6(20);
		int b = MethodsClass.m8(30);
		System.out.println("Static method arg passing and return "+b);
		
		MethodsClass obj = new MethodsClass();
		obj.m2();
		int c= obj.m4();
		System.out.println("non static method int rerun "+c);
		obj.m5(10);
		int d = obj.m7(20);
		System.out.println("non static mehtod arg passing and return "+d);

	}

}
