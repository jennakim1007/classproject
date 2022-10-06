package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SerializableTest2 {

	public static void main(String[] args) {

		ObjectInputStream inputStream = null;
		
		try {
			
			// 객체가 여러 개 들어가는 경우 저장된 순서에 맞게 형변환!!!
			// 보통은 파일에 하나의 객체만 담는다... 
			
			inputStream = new ObjectInputStream(new FileInputStream("instanceData.ser"));
			String str = (String)inputStream.readObject(); // String 으로 형변환해주고 불러오기 
			System.out.println(str);
			
			Person p = (Person)inputStream.readObject(); // 형변환 
			p.tell();
			
			ArrayList<Person> list = (ArrayList<Person>)inputStream.readObject();
			for(Person person: list) {
				person.tell();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		
	}

}
