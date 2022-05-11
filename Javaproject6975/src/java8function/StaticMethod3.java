package java8function;

interface Engine 
{
	abstract public void speed();
}

class Car4
{
	public static void average() {
		System.out.println("The averge of the car is very Good");
	}
}

public class StaticMethod3 {
	public static void main(String[] args) {
		
		Engine obj = () -> System.out.println("Speed is Good");
		obj.speed();
		
		Engine obj1 = Car4::average;
		obj1.speed();

	}

}