package chapter06;

public class ArrayTest4 {
	
	public static void main(String[] args) {
		
		// 2차원 배열 : 1차원 배열의 집합 
		// int[][] arr  
		// new int[][]
		
		int[][] arr = new int[2][4];
		
		// arr 은 (요소 개수가 4개인 1차원 배열) 2개를 가지는 배열 인스턴스를 가르킨다!
		// 1차원 배열의 사이즈는 4
		System.out.println("2차원 배열의 사이즈 : " + arr.length); // 1차원 배열을 몇 개 가지고 있는지
		
		System.out.println("첫 번쨰 2차원 배열의 사이즈 : " + arr[0].length); // arr[0] -> 첫 번째 배열의 사이즈
		System.out.println("두 번쨰 2차원 배열의 사이즈 : " + arr[1].length);
		
		// 배열 요소에 참조
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[0][2] = 13;
		
		arr[1][0] = 21;
		arr[1][1] = 22;
		arr[1][2] = 23;
		
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "]" + "[" + j + "] = " + arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		// 2차원 배열의 초기화
		int[][] scores = {
				{11,12,13}, {21,22,23}, {31,32,33}, {41,42,43}	
		};
		
		// i<scores.lenth 범위 => 4(0~3)
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}
