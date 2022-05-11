package java8function;

interface Staticmethod 
{
	public static void display() 
	{
		System.out.println("This is java 8 static method ");
	}
}

public class InterfaceStaticMethod implements Staticmethod
{

	public static void main(String[] args)
	{

		Staticmethod.display();

	}

}
