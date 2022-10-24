package MiniGames;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	static int score = 0; // 점수
	static int life = 3; // 시도횟수 한도

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int correctNumber = ran.nextInt(100) + 1; // 정답


		System.out.println("1~100 사이의 수 중에 컴퓨터가 생각하는 숫자를 맞춰보세요. ");
		System.out.println("기회는 " + life + "번 입니다. ");
		System.out.println(correctNumber);
		System.out.println("============================================");

		while (life > 0) {

			
			int playerNumber = sc.nextInt();

			if (playerNumber > correctNumber) {
				System.out.println("숫자는 " + playerNumber + "보다 작습니다. ");
				life--;
				if (life > 0) {
					System.out.println("기회는 " + life + "번 남았습니다. ");
				} else {
					System.out.println("기회를 모두 소진하였습니다. ");
				}

			} else if (playerNumber < correctNumber) {
				System.out.println("숫자는 " + playerNumber + "보다 큽니다. ");
				life--;
				if (life > 0) {
					System.out.println("기회는 " + life + "번 남았습니다. ");
				} else {
					System.out.println("기회를 모두 소진하였습니다. ");
				}

			} else if (playerNumber == correctNumber) {
				System.out.println("정답입니다!");
				score+=10;
				System.out.println("점수는 " + score + "점 입니다.");
				System.out.println("계속 플레이 하시겠습니까? (네/아니요) ");
				if (sc.nextLine().equals("네")) {
					continue;
				} else if(sc.nextLine().equals("아니요")) {
					break;
				}
				
			}

			
			
			
			
		} // while

	} // main


	
	
}
