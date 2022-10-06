package chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTransferTest3 {

	public static void main(String[] args) {

		// 파일 복사 
		// 특정 파일의 데이터를 읽어서 다른 위치의 파일에 쓰면 -> 복사 
		// 배열을 사용하여 복사를 빠르게 할 수 있다 
		
		// 원본파일
		InputStream in = null;
		// 복사본 파일 
		OutputStream out = null;
		// 보조 스트림(필터 스트림) : 기본 스트림에 보조적인 역할을 하는 스트림 
		// 보조 스트림을 이용하기 위해서는 기본 스트림이 먼저 생성되어야 한다 
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		
		try {
			in = new FileInputStream("c:\\test\\test.pdf");
			bin = new BufferedInputStream(in);
			
			// out = new FileOutputStream("c:\\test\\testCopy3.pdf");
			bout = new BufferedOutputStream(new FileOutputStream("c:\\test\\testCopy3.pdf"));
			
			System.out.println("복사가 시작되었습니다. ");
			
			while(true) {
			
				int data = bin.read();
				if(data==-1) {
					break;
				}
				bout.write(data);
			} 
			
			System.out.println("복사 완료!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			if(out!=null ) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
