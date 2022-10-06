package chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		try(BufferedReader in = new BufferedReader(new FileReader("C:\\test\\text2.txt"))){
			
			while(true) {
				String str = in.readLine();
				if(str==null) {
					break;
				}
				System.out.println(str);
			}
			System.out.println("\n프로그램 종료 ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
