package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.*;

public class MyTreeMap {

	public static void main(String[] args)
	{
		TreeMap treeMap = new TreeMap( );
		treeMap.put("name", "mayur");
		treeMap.put("id", new Integer(46));
		treeMap.put("address", "Manila");

		Collection values= treeMap.values();
				
		Iterator iterator = values.iterator( );
		System.out.println("Printing the VALUES....");

		while (iterator.hasNext())

		{

		System.out.println(iterator.next( ));
		}
	}

}
