package java8function;

import java.util.function.Supplier;

public class Supplier2 {

	public static void main(String[] args)
{
		Supplier<Double> sup= () -> Math.random();
		System.out.println(sup.get());
	}

}
