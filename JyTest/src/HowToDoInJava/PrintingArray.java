package HowToDoInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintingArray {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("First");
		list.add("Second");
	    list.add("Third");
	    list.add("Fourth");
		
		System.out.println(list);
		
		String[] list2 = new String[] {"First", "Second", "Third"};
		System.out.println(list2.toString());
		System.out.println(Arrays.toString(list2));
		
		
	}

}
