package chapter09;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar cal1 = Calendar.getInstance();
		// System.out.println(cal1);

		System.out.println(cal1.getTime()); // Date 받기
		System.out.println(cal1.getTimeInMillis()); // 밀리초 받기

		// 현재 시간에서 1시간 증가시키기
		cal1.add(Calendar.HOUR, 1);
		System.out.println(cal1.getTime());

		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		// 현재 날짜 정보가 아닌 특정 날짜와 시간을 지정
		cal2.set(2002, 06, 04);
		cal3.set(2000, 00, 01, 00, 00, 01); // month가 0부터 시작되므로, month 를 0으로 해야 jan 이 나온다. 
		
		System.out.println(cal2.getTime());
		System.out.println(cal3.getTime());
		
		// 이전, 이후 시간인지 판단 
		// cal1 2022, cal3 2000
		System.out.println(cal1.before(cal3));
		System.out.println(cal1.after(cal3));
		
		
		
		

	}

}
