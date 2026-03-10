package ch08;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println(Calendar.AM);
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);

		System.out.println(c.get(Calendar.YEAR)); //
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println();
		System.out.println();

	}

}
