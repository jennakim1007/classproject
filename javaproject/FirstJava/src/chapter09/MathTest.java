package chapter09;

public class MathTest {

	public static void main(String[] args) {

		// PI
		System.out.println(Math.PI);

		// 난수 생성 // 0.0 <= random < 1
		System.out.println(Math.random());

		// 1~45 난수 생성
		int num = (int) (Math.random() * 45) + 1; // 0~44
		System.out.println(num);

		// 절사(내림하여 반환)
		System.out.println(Math.floor(30.0001));

		// 반올림
		System.out.println(Math.round(3.9002));

		// 비교 > 두 값 중 큰 값 반환
		System.out.println(Math.max(2, 5));

		// 비교 > 두 값 중 작은 값 반환
		System.out.println(Math.min(2, 5));

		
		
	}

}
