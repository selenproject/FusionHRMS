package Polymorphism;

public class Parent {

public void m1(){
	System.out.println("parent m1 method");
}

public Parent m2(){
	
	return null;
}

final void m3(){
	System.out.println("m3 final method");
}

public static void m4(){
	System.out.println("m4 static method");
}

private void m5(){ // private methods do not override because it is specific to class
	System.out.println("m5 private method");
}

protected void m6(){
	System.out.println("m6 protected method");
}

void m7(){
	System.out.println("m7 default method");
}

public void m8(){
	System.out.println("m8 public method");
}

}
