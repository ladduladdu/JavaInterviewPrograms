package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapConsept {

	public static void main(String[] args) {

		HashMap<Integer, String> names = new HashMap<Integer, String>();

		names.put(1, "Arjun");
		names.put(2, "Arjun1");
		names.put(3, "Arjun2");
		names.put(4, "Arjun3");
		names.put(5, "Arjun4");

		System.out.println(names.get(1));
		System.out.println(names.size());

		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		hm1.putAll(names);
		System.out.println("\nvalues are in second map" + hm1);

		names.clear();

		System.out.println(names.isEmpty());

		HashMap<Integer, String> hm3 = new HashMap<Integer, String>();
		hm3 = (HashMap) hm1.clone();
		System.out.println(hm3);

		// printing specific value from the map
		System.out.println("Priniting specific value from hashMap");

		System.out.println(hm3.get(3));

		// Printing the map values in Set view format
		Set set = hm3.entrySet();
		System.out.println(set);

		// Printing the map key values in Set view format
		Set ks = hm3.keySet();
		System.out.println(ks);

		// Printing the map values in Set Format
		System.out.println(hm3.values());

		// to print all the hashmap values
		for (Entry<Integer, String> name : names.entrySet()) {
			System.out.println(name.getKey() + " " + name.getValue());
		}

		for (Map.Entry str : names.entrySet()) {
			System.out.println(str.getKey() + " " + str.getValue());

		}

		if (hm3.containsKey(3)) {

			System.out.println("Value is available");

		} else {

			System.out.println("Value not  available");
		}

	}

}
