package interview.question.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterviewAnsers {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(10);
		ar.add(110);
		ar.add(20);
		ar.add(200);
		
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i)>max) {
				max=ar.get(i);		
			}
		}
		System.out.println(max);
		
		String str="Good Morning";
		
		Object ar1[]=str.split(" ");
		
		System.out.println(ar1[1]+" "+ar1[0]);
		
		

		
		// System.out.println(Collections.max(ar));
		// System.out.println(Collections.min(ar));

	}

}
