package java8function;

@FunctionalInterface
interface Square {
	int calculate(int X);
}

public class Lambda {

	public static void main(String[] args) {
		int a = 5;

		Square s = (int x) -> x * x;

		int ans = s.calculate(a);
		System.out.println(ans);
	}

}
