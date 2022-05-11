package operators;

public class incrementDecrement {

	public static void main(String[] args)

	{
		int a = 40;
		int b = 50;
//		int c= ++b;
//		
//		System.out.print("print of c=");
//		System.out.println(c);

		System.out.println("print a value  =" + a);
		System.out.println("print b value  =" + b);

		System.out.println("-------------Increment-------------");

		System.out.println("print ++a value =" + (++a));
		System.out.println("print a++ value =" + (a++));
		System.out.println("print b++ value =" + (b++));
		System.out.println("print ++b value =" + (++b));

		System.out.println("-------------Decrement-------------");

		System.out.println("print --a value =" + (--a));
		System.out.println("print a-- value =" + (a--));
		System.out.println("print b-- value =" + (b--));
		System.out.println("print --b value =" + (--b));
	}

}
