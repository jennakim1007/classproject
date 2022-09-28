package chapter09.test.jy;

public class Person2 {

	public static void main(String[] args) {

		// 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다.
		// System  클래스의 메소드 중 currentTimeMillis() 또는 nanoTime() 을 활용 

		long startTime = System.nanoTime();
		long startTime2 = System.currentTimeMillis();
		// System.out.println(startTime);
		
		int sum = 0;
		for(int i=1; i<=100000000; i++ ) {
			sum+=i;
		}
		
		System.out.println("1~100,000,000까지 더한 값 : " + sum);
		
		long endTime = System.nanoTime();
		long endTime2 = System.currentTimeMillis();
		// System.out.println(endTime);
		
		System.out.println("연산 실행 소요 시간 : " + (endTime-startTime));
		System.out.println("연산 실행 소요 시간 : " + (endTime2-startTime2));
		
	}

}
