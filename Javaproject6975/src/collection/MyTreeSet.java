package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();

		tree.add("Jody");
		tree.add("Remiel");
		tree.add("Reggie");
		tree.add("Philippe");

		Iterator iterator = tree.iterator();

		while (iterator.hasNext())

		{

			System.out.println(iterator.next().toString());
		}

	}
}
