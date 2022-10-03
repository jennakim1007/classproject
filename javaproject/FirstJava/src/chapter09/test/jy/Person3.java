package chapter09.test.jy;

import java.util.Scanner;

public class Person3 {

	public static void main(String[] args) {
		
		// 사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고, 
		// 공백으로 입력되었는지도 판별하는 프로그램을 만들어봅시다

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		
		if(checkName(name) && !(name.isBlank())) {
			System.out.println("이름 : " + name);
		} else {
			System.out.println("영문자만 입력하세요. 공백은 입력할 수 없습니다. ");
		}
	}
	
	
	static boolean checkName(String name) {

		boolean result = true;
		// charAt(i)
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
				result = false;
				break;
			}
		}
		return result;
	}
	
}
