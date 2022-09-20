package chapter05.test;

import java.sql.Date;
import java.util.Scanner;

public class Candy {
	
	// width와 height 는 고정값, type이 다른 사탕을 만들자
	static int width = 100;
	static int height = 100;
	String type;
	
	Candy(String type) {
		this.type = type; // 초기화
	}
	
	public static void main(String[] args) {
		
		Scanner sc = null;
		Date date = null;
		
		// static 없이 인스턴스 80개 생성시 -> 변수 240개 생성
		// static 을 사용하여 인스턴스 80개 생성시 -> 변수 80+2개 생성 
		Candy c1 = new Candy("허브1");
		Candy c2 = new Candy("허브2");
		Candy c3 = new Candy("허브3");
		Candy c4 = new Candy("허브4");
		Candy c5 = new Candy("허브5");
		Candy c6 = new Candy("허브6");
		Candy c7 = new Candy("허브7");
		Candy c8 = new Candy("허브8");
	}

}
