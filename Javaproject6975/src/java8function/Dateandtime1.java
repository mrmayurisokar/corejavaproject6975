package java8function;

import java.time.LocalDate;
import java.time.LocalTime;

public class Dateandtime1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);

		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		System.out.println(day + "..." + month + "..." + year);
		System.out.printf("\n%d-%d-%d", day, month, year);
	}

}
