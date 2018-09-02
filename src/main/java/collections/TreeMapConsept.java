package collections;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConsept {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new sort_key());

		tm.put(10, "Arjun");
		tm.put(30, "Arjun2");
		tm.put(60, "Arjun5");
		tm.put(40, "Arjun3");
		tm.put(20, "Arjun1");
		tm.put(50, "Arjun4");
		System.out.println(tm);

		// To get the least or greatest value from given key
		System.out.println(tm.ceilingEntry(24));

		// To get the least or greatest key from given key
		System.out.println(tm.ceilingKey(31));

		// To get the equal and greatest values from given number
		System.out.println(tm.tailMap(20));

		// To get the greatest values from given number
		System.out.println(tm.tailMap(20, false));

		// To get the first value from the treeMap
		System.out.println(tm.pollFirstEntry());
		// To get the last value from the treeMap
		System.out.println(tm.pollLastEntry());

		// to get the values from one index to another index(get the values in between
		// starting index and ending index)
		System.out.println(tm.subMap(10, true, 50, true));

		// to get the next value from the given number
		System.out.println(tm.higherEntry(10));
		System.out.println(tm.higherEntry(30));
		System.out.println(tm.higherEntry(40));
		System.out.println(tm.higherEntry(50));

		// to get the least values from given number
		System.out.println(tm.headMap(10));
		System.out.println(tm.headMap(30));
		System.out.println(tm.headMap(50));
		System.out.println(tm.headMap(60));
		System.out.println(tm.headMap(70));

		// to get the lesser values and equal number from the given key
		System.out.println(tm.headMap(10, true));
		System.out.println(tm.headMap(30, true));
		System.out.println(tm.headMap(50, true));
		System.out.println(tm.headMap(60, true));
		System.out.println(tm.headMap(70, true));

		// TO get the nearest least value from the given key
		System.out.println(tm.floorEntry(29));

		// TO get the nearest least key from the given key
		System.out.println(tm.floorKey(29));

		// TO get the nearest least key from the given key
		System.out.println(tm.floorKey(21));

		// TO get the nearest least key from the given key
		System.out.println(tm.floorKey(35));

		// TO get the First value in the list
		System.out.println(tm.firstEntry());

		// TO get the last keyValue in the list
		System.out.println(tm.lastKey());

		// to print the keyValues in descending order
		System.out.println(tm.descendingKeySet());

		for (Entry<Integer, String> it : tm.entrySet()) {

			System.out.println(it.getKey() + " " + it.getValue());
		}

		// To get the values in SetFormat

		Set<Integer> st = tm.keySet();

		for (Integer in : st) {
			System.out.println(in);

		}
	}
}



class sort_key implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {

		return o1.compareTo(o2);
	}

}
