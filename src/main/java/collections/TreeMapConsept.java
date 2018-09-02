package collections;

import java.util.Comparator;
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
		
		
		//System.out.println(tm.ceilingEntry(24));
		
		System.out.println(tm.ceilingKey(31));
		
		// System.out.println(tm.tailMap(20));
		// System.out.println(tm.tailMap(20, false));
		
		// System.out.println(tm.pollFirstEntry());
		// System.out.println(tm.pollLastEntry());
		// System.out.println(tm.subMap(10,true, 50,true));

		// System.out.println(tm.higherEntry(10));
		// System.out.println(tm.higherEntry(30));
		// System.out.println(tm.higherEntry(40));
		// System.out.println(tm.higherEntry(50));

		// System.out.println(tm.headMap(10));
		// System.out.println(tm.headMap(30));
		// System.out.println(tm.headMap(50));
		// System.out.println(tm.headMap(60));
		// System.out.println(tm.headMap(70));
		

//		System.out.println(tm.headMap(10, true));
//		System.out.println(tm.headMap(30, true));
//		System.out.println(tm.headMap(50, true));
//		System.out.println(tm.headMap(60, true));
//		System.out.println(tm.headMap(70, true));

		// System.out.println(tm.floorEntry(19));
		// System.out.println(tm.floorKey(17));
		// System.out.println(tm.floorKey(21));
		// System.out.println(tm.floorKey(35));
		// System.out.println(tm.firstEntry());
		// System.out.println(tm.lastKey());
		// System.out.println(tm.descendingKeySet());

	}
}

class sort_key implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {

		return o1.compareTo(o2);
	}

	// for(Entry<Integer,String> it:tm.entrySet())
	// {
	//
	// System.out.println(it.getKey()+" "+it.getValue());
	// }

	// Set<Integer> st = tm.keySet();
	//
	//
	// for (Integer in : st) {
	// System.out.println(in);
	//
	// }
	//

}
