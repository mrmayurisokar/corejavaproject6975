package java8function;

interface Engine3 {
	abstract public void speed();
}

class Car1 {
	public Car1() {
		System.out.println("This is constructor of Car1");
	}
}

public class Consteuctor3 {
	public static void main(String[] args) {
// Using Lamda epression
		Engine obj = () -> System.out.println("Speed is Good");
		obj.speed();
// Lamda replaced with instance method Reference
		Engine obj4 = Car::new;

		obj4.speed();

	}

}
