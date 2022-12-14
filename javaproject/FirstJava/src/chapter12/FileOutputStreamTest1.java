package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {

		// 파일에 쓰기 위해서는 : OutputStream -> FileOutputStream

		FileOutputStream outputStream = null;
		
		try {
			// 생성자에 자원의 경로 지정하고 스트림 인스턴스 생성 
			outputStream = new FileOutputStream("C:\\test\\testfile1.txt"); // 경로는 역슬래시 두 개 쓰기
			outputStream.write(65); // 쓰기
			
			outputStream.close(); // close 꼭 해줘야 한다 
			
			System.out.println("파일에 데이터 쓰기 성공! ");
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로에 파일이 존재하지 않습니다. ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("출력 오류");
			e.printStackTrace();
		}
		
		
		
		
	}

	
	
	
	
}
