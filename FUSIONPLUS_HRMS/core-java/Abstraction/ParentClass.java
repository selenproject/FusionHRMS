package Abstraction;

public abstract class ParentClass {
	int i = 0;

	ParentClass() {
		System.out.println("sbstract class constructor");
	}

	{
		System.out.println("abstract instance block");
	}

	static {
		System.out.println("abstract class static block");
	}

	public abstract void m1();

	protected abstract void m2();

	public void m3() {
		System.out.println("m3 method");
	}

}
