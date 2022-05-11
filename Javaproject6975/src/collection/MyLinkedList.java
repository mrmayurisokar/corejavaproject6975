package collection;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) 
	{
		LinkedList alist = new LinkedList( );

		alist.add(new String("One"));
		alist.add(new String("Two"));
		alist.add(new String("Three"));

		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));

	}

}
