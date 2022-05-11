package java8function;

import java.util.function.Function;

public class Functional2 {

	public static void main(String[] args) {
		Function<String, Integer> fun = s -> s.length();
		System.out.println(fun.apply("Hello"));

		int amount = 3;
		Function<Integer, Integer> sum = i -> i + i;
		Function<Integer, Integer> sq = i -> i * i;
		System.out.println(sum.apply(amount));

		System.out.println(sq.apply(amount));

		System.out.println(sum.andThen(sq).apply(amount));

		System.out.println(sum.compose(sq).apply(amount));
	}

}
