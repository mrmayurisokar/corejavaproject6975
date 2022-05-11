package collection;

import java.util.Vector;

public class VectorExa {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();

		vc.add("Vector Object 1");
		vc.add("Vector Object 2");
		vc.add("Vector Object 3");
		vc.add("Vector Object 4");
		vc.add("Vector Object 5");

		vc.add(3, "Element at fix position");

		System.out.println("Vector Size :" + vc.size());
	}

}
