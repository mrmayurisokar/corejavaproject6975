package collection;

import java.util.Hashtable;

public class MyHashtable {

	public static void main(String[] args) {
		Hashtable table = new Hashtable();

		table.put("name", "Mayur");
		table.put("id", new Integer(1001));
		table.put("address", new String("Manila"));

		System.out.println("Table of Contents:" + table);

	}

}
