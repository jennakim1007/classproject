package chapter09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTest {

	public static void main(String[] args) {

		// jdk 1.8 : LocalDate, LocalDateTime, LocalTime
		// 현재 날짜를 가져오자!
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfMonth());

		now = now.plusMonths(3);
		now = now.plusDays(-4);
		System.out.println(now);
		
		LocalDate nextDay = now.plusDays(2).plusMonths(12).plusYears(-7).minusDays(1);
		System.out.println(nextDay);
		
		System.out.println("=========");
		
		LocalTime now1 = LocalTime.now();
		System.out.println(now1);
		System.out.print(now1.getHour());
		System.out.print(now1.getMinute());
		System.out.println(now1.getSecond());
		System.out.println(now1.getNano());
		
		System.out.println("=========");
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		System.out.println(now2.getHour());
		System.out.println(now2.getYear());

		System.out.println("=========");

		// 특정 날짜, 시간 출력 
		LocalDate day = LocalDate.of(2022, 12, 25);
		System.out.println(day);
		LocalTime time = LocalTime.of(15, 30, 35);
		System.out.println(time);
		LocalDateTime localDateTime = LocalDateTime.of(2022, 1, 1, 13, 05);
		System.out.println(localDateTime);

		
		
	}

}
