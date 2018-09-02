package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetConsept {

	public static void main(String[] args) {

		
		TreeSet<Integer> num=new TreeSet<Integer>();
	
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(19);
		num.add(27);
		num.add(29);
		num.add(35);
		
		//Printing the values equals or near values for given number
		System.out.println(num.ceiling(10));
		System.out.println(num.ceiling(07));
		System.out.println(num.ceiling(35));
		
		//printing the values greater than given number
		System.out.println(num.higher(10));
		System.out.println(num.higher(20));
		System.out.println(num.higher(30));
		
		//printing the values less than given number
				System.out.println(num.lower(10));
				System.out.println(num.lower(20));
				System.out.println(num.lower(30));
	
		// removing first lowest number in the set
		// num.pollFirst();
		// remove last highest number in the set
		// num.pollLast();


				System.out.println(num);
		
		
		TreeSet<Integer> num1=new TreeSet<Integer>();
		
		 num1=(TreeSet)num.headSet(7);
		
	Iterator it=num1.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
		
		
		
		
		// TreeSet<String> st = new TreeSet<String>();
		// st.add("Red");
		// st.add("Yellow");
		// st.add("Black");
		// st.add("White");
		// st.add("Violet");
		
		// for (String str : st) {

		// System.out.println(str);
		// }
		// TreeSet<String> st2 = new TreeSet<String>();
		// st2.add("Blue");
		// st2.add("Green");
		// st2.add("DarkBlue");
		// st2.add("White");
		// System.out.println(st2);
		//
		// TreeSet<String> st3 = new TreeSet<String>();
		//
		// st3 = (TreeSet) st.clone();
		// System.out.println(st3);
		//
		// for (String str : st) {
		//
		// System.out.println(st2.contains(str) ? "Yes" : "No");
		// }
		//
		// System.out.println(st3.size());

		// //adding values from one set to another set
		// System.out.println(st.addAll(st2));
		//
		//
		//
		// Iterator it=st2.descendingIterator();
		//
		// while (it.hasNext()) {
		//
		// System.out.println(it.next());
		//
		// }
		//
		// System.out.println(st2.first());
		// System.out.println(st2.last());
		//

	}

}
