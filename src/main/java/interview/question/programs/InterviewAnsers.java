package interview.question.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterviewAnsers {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(10);
		ar.add(110);
		ar.add(20);
		ar.add(200);

		// System.out.println(Collections.max(ar));
		// System.out.println(Collections.min(ar));

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) > max) {
				max = ar.get(i);
			}
		}
		System.out.println(max);

		String str = "Good Morning";

		Object ar1[] = str.split(" ");

		System.out.println(ar1[1] + " " + ar1[0]);

		String st = "123,345,567,678,789";

		String[] st1 = st.split(", ");

		for (int i = 0; i < st1.length - 1; i++) {
			int val = st1[i].compareTo(st1[i + 1]);
			System.out.println(val);

		}

		List<Integer> in = new ArrayList<Integer>();

		for (String str2 : st1) {
			in.add(Integer.parseInt(str2));

		}

		Set<Integer> values = new HashSet<Integer>();
		for (Integer in1 : values) {
			if (values.add(in1) == false) {

				System.out.println("Duplicate values are " + in);
			} else {
				System.out.println("Unique values are " + in);
			}
		}

		ArrayList<Integer> dupliactes = new ArrayList<Integer>();
		ArrayList<Integer> unique = new ArrayList<Integer>();

		// for (int i = 0; i < str1.length; i++) {
		// if (!unique.contains(str1[i])) {
		// unique.add(str1[i]);
		// }
		// else{
		//
		// dupliactes.add(str1[i]);
		// }
		//
		// }
		// System.out.println(unique);
		//
		// System.out.println(dupliactes);
	}
}