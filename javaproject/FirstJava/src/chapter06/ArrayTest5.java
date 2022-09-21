package chapter06;

public class ArrayTest5 {

	public static void main(String[] args) {
		
		// 향상된 for 문(The enhanced for statement)을 이용한 배열 처리

		int[] numbers = { 2, 6, 14, 90, 40 };

		for (int num : numbers) {
			System.out.print(num + "\t");
		}

		System.out.println();

		int[][] scores = { { 100, 90, 60 }, { 40, 100, 90 } };

		for (int[] temp : scores) {
			for (int num : temp) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}

	}

}
