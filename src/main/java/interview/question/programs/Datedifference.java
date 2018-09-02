package interview.question.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datedifference {

	public static int monthDiff(String s1, String s2) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();

		Date d1 = sdf.parse(s1);
		Date d2 = sdf.parse(s2);
		cal.setTime(d1);

		int m1 = cal.get(Calendar.MONTH);
		int y1 = cal.get(Calendar.YEAR);

		cal.setTime(d2);

		int m2 = cal.get(Calendar.MONTH);
		int y2 = cal.get(Calendar.YEAR);

		int n = (y2 - y1) * 12 + (m1 - m2);
		return n;

	}

	public static void main(String[] args) throws ParseException {

		String s1 = new String("2017-10-19");
		String s2 = new String("2018-09-02");

		int dateDiff = monthDiff(s1, s2);
		System.out.println(dateDiff);

	}

}
