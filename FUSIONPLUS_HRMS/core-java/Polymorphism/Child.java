package Polymorphism;

public class Child extends Parent{

public void m1(){//method signature and return type must be same at primitive level
		System.out.println("child m1 method");
	}

public Child m2(){ // co-variant return type and signature must be same 
	System.out.println("co-variant return type");
	return null;
}

/*final void m3(){ // final methods not possible overriding
	
}*/

public static void m4(){
	System.out.println("static method");
}

private void m5(){
	System.out.println("m5 private method");
}

protected void m6(){ // same permission level
	System.out.println("m6 protected method, same permision");
}

public void m7(){ //increase permission level
	System.out.println("m7 increase premission level");
}

/*void m8(){ // decrease permission leverl
	System.out.println("m8 decrease permission level");
}
*/
	public static void main(String[] args) {

		Child obj = new Child();
		obj.m1();
		obj.m2();
		obj.m4();//Static methods does not overriding
		obj.m5();
		obj.m6();
		obj.m7();
	}

}
