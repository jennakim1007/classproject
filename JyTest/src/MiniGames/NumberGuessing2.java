package MiniGames;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing2 {

	static int score = 0; // 점수
	static int life = 3; // 시도횟수 한도
	
	static void ResetGame(int IsRetry) {
		if(IsRetry == 0) {
			score = 0;
			life = 3;
		}
		else if(IsRetry == 1) {
			System.out.print("게임 오버");
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int correctNumber = ran.nextInt(100)+1; // 정답
		
		//System.out.println("1~100 사이의 수 중에 컴퓨터가 생각하는 숫자를 맞춰보세요. ");
		//System.out.println(correctNumber);
		//System.out.println("============================================");

		while(life > 0) {
			
			if(life == 3) {
				System.out.println("1~100 사이의 수 중에 컴퓨터가 생각하는 숫자를 맞춰보세요. ");
				System.out.println(correctNumber);
				System.out.println("============================================");
			}
			
			int playerNumber = sc.nextInt();
			
			System.out.println("남은 라이프 : " + life);
			
			if(playerNumber < correctNumber) {
				System.out.println("Up");
				life--;
			}
			else if(playerNumber > correctNumber) {
				System.out.println("Down");
				life--;
			}
			else if(playerNumber == correctNumber){
				System.out.println("정답");
				System.out.println("다시시도? 0 : 네 1 : 아니오");
				int r = sc.nextInt();
				ResetGame(r);
				if(r == 0) {
					continue;
				}
				else {
					break;
				}
			}
			
			if(life == 0) {
				System.out.println("실패");
				System.out.println("다시시도? 0 : 네 1 : 아니오");
				
				int r = sc.nextInt();
				
				ResetGame(r);
				if(r == 0) {
					continue;
				}
				else {
					break;
				}
			}
		}
	}

}
