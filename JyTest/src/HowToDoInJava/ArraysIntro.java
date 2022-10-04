package HowToDoInJava;

import java.util.Arrays;

public class ArraysIntro {

	public static void main(String[] args) {
		
		String status[] = {"Active", "Inactive", "Purged"};
		
		for(String s : status) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(status));
		
		
		
	}
	
	
	
	
	
}
