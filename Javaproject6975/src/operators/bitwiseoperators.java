package operators;

public class bitwiseoperators {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		System.out.println("a&b" + (a & b));
		System.out.println("a|b = " + (a | b));
		System.out.println("a^b = " + (a ^ b));
		
		System.out.println("~a = " + ~a);
		
		a &= b;
	}

}
