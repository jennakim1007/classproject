package chapter09.test.jy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Person4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘까지 몇 일을 살았는지 계산해봅시다. ");
		System.out.print("태어난 년도를 입력하세요. >>> ");
		int birthYear = sc.nextInt();
		System.out.print("태어난 월을 입력하세요. >>> ");
		int birthMonth = sc.nextInt();
		System.out.print("태어난 일을 입력하세요. >>> ");
		int birthDate = sc.nextInt();

		LocalDate birthDay = LocalDate.of(birthYear, birthMonth, birthDate);
		LocalDate now = LocalDate.now();
	
		long days = ChronoUnit.DAYS.between(birthDay, now);
		System.out.println("살아온 일자 : " + days);

	}
	
	

}
