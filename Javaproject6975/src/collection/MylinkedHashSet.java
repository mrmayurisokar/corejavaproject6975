package collection;

import java.util.LinkedHashSet;

public class MylinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add(new String("One"));
		lhs.add(new String("Two"));
		lhs.add(new String("Three"));
		Object array[] = lhs.toArray();
		for (int x = 0; x < 3; x++) {
			System.out.println(array[x]);
		}

	}
}
