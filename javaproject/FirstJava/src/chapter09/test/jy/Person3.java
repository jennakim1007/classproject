package chapter09.test.jy;

import java.util.Scanner;

public class Person3 {

	public static void main(String[] args) {

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
