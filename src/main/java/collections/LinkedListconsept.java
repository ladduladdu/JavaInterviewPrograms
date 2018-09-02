package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListconsept {

	public static void main(String[] args) {

		LinkedList<String> ln = new LinkedList<String>();

		ln.add("Arjun");
		ln.add("Arjun1");
		ln.add("Arjun2");
		ln.add("Arjun3");
		ln.add("Arjun4");
		ln.add("Arjun5");
		//ln.remove(1);
		// Collections.swap(ln, 0, 2);
		// Collections.shuffle(ln);
		
		//converting linked list to arrylist
		ArrayList<String> ar=new ArrayList<String>(ln);
		
		System.out.println("Printing values from array list");
		System.out.println(ar);
		
		
		System.out.println(ln.pop());
		System.out.println(ln.peekFirst());
		System.out.println(ln.peek());
		System.out.println(ln.peekLast());
		
		System.out.println(ln);
		for (int i = 0; i < ln.size(); i++) {
			System.out.println(i+":" +ln.get(i));
			
		}
		
		
		ln.add(3, "NewArjun");
		ln.addFirst("Arjun12");
		ln.addLast("Arjun231");
		ln.offerFirst("Arjun admin");
		System.out.println(ln.get(3));

		System.out.println(ln);

		// Printing the values using for loop
		System.out.println("********** Printing the values using for loop ***********");
		for (int i = 0; i < ln.size(); i++) {

			System.out.println(ln.get(i));

		}
		// Printing the values using for each loop
		System.out.println("********** Printing the values using for each loop ***********");
		for (String st : ln) {
			System.out.println(st);

		}

		// Printing the values using iterator
		System.out.println("********** Printing the values using Iterator ***********");
		Iterator it = ln.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		// Printing the values from particular index
				System.out.println("********** Printing the values from particular value  ***********");
		Iterator it1 = ln.listIterator(3);

		while (it1.hasNext()) {

			System.out.println(it1.next());

		}
		
		
		// Printing the values in reverse  order
		System.out.println("********** Printing the values in reverce ***********");
Iterator it2 = ln.descendingIterator();

while (it2.hasNext()) {

	System.out.println(it2.next());

}

	}

}
