package chapter09.exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exam4Main {

	public static void main(String[] args) {

		LocalDate birthDay = LocalDate.of(1996, 10, 07);
		LocalDate now = LocalDate.now();
		
		long days = ChronoUnit.DAYS.between(birthDay, now);
		long months = ChronoUnit.MONTHS.between(birthDay, now);
		long years = ChronoUnit.YEARS.between(birthDay, now);
		System.out.println(days);
		System.out.println(months);
		System.out.println(years);

		LocalDate cDay = LocalDate.of(2022, 12, 25);
		
		long days2 = ChronoUnit.DAYS.between(now, cDay);
		System.out.println(days2);

		LocalDate dDay = now.plusDays(88);
		System.out.println(dDay);
		
	}

}
