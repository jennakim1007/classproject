package chapter06;

public class ArrayTest7 {

	public static void main(String[] args) {

		// Math.random() : 반환 타입 double
		// 0.0 <= Math.random() < 1
		// 0~9 까지의 수 랜덤으로 받는 법
		// 0.0 *10 <= Math.random() *10 < 1 *10
		// 0.0 *10 <= Math.random() *10 < 1 *10
		// 0.0 < Math.random() < 9.9999...
		// 0.0 *10 <= (int)(Math.random() *10) < 1 *10 -> 형변환하여 소수점 자르기
		// 0 < r <=9

		System.out.println(Math.random());
		System.out.println((int) (Math.random() * 10));

		String[] players = { "손흥민", "박지성", "차두리", "안정환", "차범근"

		};

		// 0번지의 값과 1번지 값을 치환

		for (int i = 0; i < 10000; i++) {
			// 0번지와 다른 번지 값을 치환
			// 1~4
			// 0 <= r <= 3
			// 1 <= r <= 4
			int randomIndex = (int) (Math.random() * 4) + 1;

			String temp = null;
			temp = players[0];
			players[0] = players[randomIndex];
			players[randomIndex] = temp;
		}
		
		for(String name : players) {
			System.out.println(name);
		}

//		System.out.println(players[0]);
//		System.out.println(players[1]);

		// index : 0~4
		int index = (int) (Math.random() * 5);
		String pickName = players[index];
		System.out.println(pickName);

	}

}
