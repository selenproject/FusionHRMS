package Abstraction;

public interface ChildInterface extends ParentInterface {
	static void m3() {
		System.out.println("static implementation");
	}

	void m4();

	public static void main(String[] agrs) {
		m3();
	}
}
