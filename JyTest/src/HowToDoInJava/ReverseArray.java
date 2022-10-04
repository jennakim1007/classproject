package HowToDoInJava;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {

		String[] array = {"A", "B", "C", "D", "E"};

//		Collections.reverse(Arrays.asList(array));
//		System.out.println(Arrays.toString(array));
		
		for(int i = 0; i < array.length / 2; i++) {
			String temp = array[i];
			array[i] = array[array.length -1 -i];
			array[array.length -1 -i] = temp;
		}
		
		for(String i:array) {
			System.out.println(i);
		}
		
		for(int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
		}			
		
	}

}
