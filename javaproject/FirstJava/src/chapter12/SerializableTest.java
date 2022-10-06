package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableTest {

	public static void main(String[] args) {

		String msg = "안녕하세요! 반갑습니다. ";
		
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("instanceData.ser")); // 필터스트림 // ser 확장자는 java 에서 직렬화 할 때 쓰도록 권장함 // 특정경로 안 잡으면 클래스 프로젝트 경로로 나온다.
			outputStream.writeObject(msg);
			
			Person p = new Person("손흥민", 20);
			outputStream.writeObject(p);
			
			ArrayList<Person> list = new ArrayList<>();
			list.add(p);
			list.add(new Person("손흥민1", 21));
			list.add(new Person("손흥민2", 22));
			list.add(new Person("손흥민3", 23));
			list.add(new Person("손흥민4", 24));

			outputStream.writeObject(list);
			
			System.out.println("저장 되었습니다. ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
	}

}
