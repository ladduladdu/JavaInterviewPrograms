package collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetConsept {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("Red");
		hs.add("Blue");
		hs.add("Green");
		hs.add("Yellow");
		hs.add("White");
		System.out.println(hs);

		HashSet<String> hs2 = new HashSet<String>();

		//hs2 = (HashSet) hs.clone();		
		System.out.println(hs2);
		
		hs2.add("Black");
		hs2.add("Yellow");
		hs2.add("White");
		hs2.add("RedGreen");
		
		
		
		hs.retainAll(hs2);
		
		System.out.println(hs);
		
		
//		for (String str : hs) {
//			
//			System.out.println(hs2.contains(str) ? "Yes" : "No");
//		}
//		
//		
//		//System.out.println(hs2.retainAll(hs));
//		
//		///Converting hashSet to treeset
//		Set<String> ts=new TreeSet<>(hs2);
//		for (String tree : ts) {
//			System.out.println(tree);
//		}
//
//		//converting hashset to list/arrayList
//		
//		ArrayList<String> al=new ArrayList<String>(hs);
//		
//		for (String alist : al) {
//			System.out.println(alist);
//			
//		}
//			
//		}
		
		// converting HAshSet to array

		// String[] array = new String[hs.size()];
		//
		// hs.toArray(array);
		// for (String str : array) {
		// System.out.println("This values from array " + str);
		//
		// }
		//
		// for (String hs3 : hs2) {
		// System.out.println(hs3);
		// }
		//
		// // Printing all values usinng ForEach loop
		// // for (String hs1 : hs) {
		// // System.out.println(hs1);
		// // }
		//
		// // Printnig all values using iterator
		// Iterator<String> it = hs.iterator();
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// }
		//
		// // To print number of values are avilable in hasSet
		// System.out.println(hs.size());
		//
		// // To remove or empty the hashSet values
		// hs.clear();
		// hs.removeAll(hs);
		// System.out.println(hs);

	}
}

