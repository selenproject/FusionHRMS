package Abstraction;

public class InterfaceClass implements ChildInterface {

	// @Override
	public void m1() {
	System.out.println("m1 implemented");

	}

	// @Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	// @Override
	public void m3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		InterfaceClass obj = new InterfaceClass();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}

}
