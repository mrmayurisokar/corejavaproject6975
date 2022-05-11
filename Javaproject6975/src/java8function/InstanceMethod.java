package java8function;

interface Engine1 {
	abstract public void speed();
}

class Car {
	public void wheel() {
		System.out.println("Car has wheels of MRF company");
	}
}

public class InstanceMethod {
	public static void main(String[] args) {

		Engine1 obj = () -> System.out.println("Speed is Good");
		obj.speed();

		Car car = new Car();
		Engine1 obj4 = car::wheel;

	}
}
