package bishiTest;

public class Demo1 {
	public static void main(String[] args) {
		int n = 4;
		cInt(n);
		System.out.println(n);
		Integer a = new Integer(4);
		cInteger(a);
		System.out.println(a);
		String s = "4";
		cString(s);
		System.out.println(s);
	}

	private static void cInt(int n) {
		n = 3;
		
	}

	private static void cString(String s) {
		s = "3";
		
	}

	private static void cInteger(Integer a) {
		a = new Integer(3);
		
	}

}
