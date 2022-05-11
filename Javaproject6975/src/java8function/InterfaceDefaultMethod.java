package java8function;

interface DefaultInterface {

	public void square(int a);

	default void show() {
		System.out.println("Default Method Executed");
	}
}

public class InterfaceDefaultMethod implements DefaultInterface {

	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String[] args) 
	{
		InterfaceDefaultMethod d = new InterfaceDefaultMethod();
		d.square(4);
		d.show();

	}

}
