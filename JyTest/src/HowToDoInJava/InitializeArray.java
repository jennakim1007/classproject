package HowToDoInJava;

import java.util.Arrays;

public class InitializeArray {

	public static void main(String[] args) {

		int num[] = new int[5];
		
		for(int i=0; i < num.length; i++) {
			num[i] = i;
			System.out.print(i);
		}
		
		for(int i:num) {
			System.out.print(i);
		}
		
		// 배열의 갯수 
		System.out.println(num.length);
		
		// Arrays.fill() API
		Arrays.fill(num, 1); // [1, 1, 1, 1, 1]
		
		for(int i:num) {
			System.out.print(i);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
