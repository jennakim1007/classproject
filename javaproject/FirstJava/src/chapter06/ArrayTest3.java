package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {

		// 10명의 국어점수를 저장하는 배열 선언하고 생성
		int[] korScore = new int[10];

		// 배열의 사이즈를 가지고 있는 length
		System.out.println("배열의 요소 개수 : " + korScore.length);

		for (int i = 0; i < korScore.length; i++) {

			int temp = korScore[i];
			// System.out.println(i + " : " + temp);
		}
		// 배열 요소의 초기화
		korScore[0] = 93;
		korScore[1] = 70;
		korScore[2] = 92;
		korScore[3] = 60;
		korScore[4] = 70;
		korScore[5] = 30;
		korScore[6] = 98;
		korScore[7] = 100;
		korScore[8] = 51;
		korScore[9] = 70;

		System.out.println();
		sum(korScore);

	}

	public static void sum(int[]arr) {
		
		// arr => korScores 의 배열 인스턴스 주소 
		
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("전체 점수의 총점 : " + sum);
		System.out.println("반 평균 : " + (float) sum / arr.length); // 형변환
		
	}

}
