package chapter04;

public class WhileLoop3 {

	public static void main(String[] args) {
		
		// 반복문 while
		// 1~10까지의 합을 구해보자. => 55
		// 반복 10번, 변수가 1~10까지 나오도록 
		
		int num = 1;
		int sum = 0;
		
		while(num<=10) {
			// 합을 구하는 연산 
			sum = sum + num;
			// 증가식 
			num++;
		}
		System.out.println("1~10 까지의 합 : " + sum);
		
	}

}
