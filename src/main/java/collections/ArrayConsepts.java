package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayConsepts {

	public static void main(String[] args) {

		List<String> colour = new ArrayList<String>();
		// Adding values into List
		colour.add("Red");
		colour.add("Blue");
		colour.add("Green");
		colour.add("Yellow");
		colour.add("Black");
		colour.add(3, "Pink");
		colour.set(1, "White");
		System.out.println(colour);

		// Extracting a portion

		Collections.swap(colour, 0, 4);
		System.out.println(colour);

		// colour.removeAll(colour);
		// System.out.println(colour);

		for (int i = 0; i < colour.size(); i++) {
			System.out.println(colour.get(i));

		}

		// List<String> exvalues=colour.subList(0, 3);
		// System.out.println(exvalues);
		//
		// List<String> colour3=new ArrayList<String>();

		// for (String str : colour3) {
		//
		// colour.add(exvalues.contains(str) ? "Yes":"No");
		// }

		// Sorting arraylist values
		// Collections.sort(colour);

		// Shufling array Values
		// Collections.shuffle(colour);
		// Reversing array values

		// Collections.reverse(colour);
		//
		// System.out.println(colour);

		// List<String> colour2=new ArrayList<String>();

		// Adding values from one Array list to Another ArrrayList
		// colour2.addAll(colour);

		// System.out.println("This is from colour2 ");

		// System.out.println(colour2);

		// for (String clr : colour) {
		// System.out.println(clr);
		// }

		// System.out.println(colour.get(0));
		// System.out.println(colour.get(1));
		// System.out.println(colour.get(2));
		// Saerching paricular value from ArrayList
		// if (colour.contains("Green")) {
		//
		// System.out.println("Element Found ");
		//
		// } else {
		//
		// System.out.println("Element not Found");
		//
		// }

	}

}
