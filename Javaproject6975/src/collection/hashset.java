package collection;

import java.util.*;

public class hashset {

	public static void main(String[] args) {

		Set hash = new HashSet();

		hash.add("a");
		hash.add("b");
		hash.add("c");
		hash.add("d");

		Iterator iterator = hash.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}