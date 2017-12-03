package Exception;

public class TryCatchFinally {
	{
		try {
			System.out.println("Instance block try");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	static {
		try {
			System.out.println("Static block try");
		} finally {
			System.out.println("Static block finally");
		}
	}

	TryCatchFinally() {
		try {
			System.out.println("constractor try");
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e1) { // Exception must be last exception
			System.out.println(e1);
		} finally {
			System.out.println("Constructor finally");
		}
	}

	public static void main(String[] args) {

		try {
			TryCatchFinally obj = new TryCatchFinally();
			System.out.println(obj.getClass());
			System.out.println(obj.toString());
			System.out.println(obj.equals(obj));
			System.out.println(obj.equals(args));
			System.out.println(obj.clone()); 
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally bolck");
		}
	}
}