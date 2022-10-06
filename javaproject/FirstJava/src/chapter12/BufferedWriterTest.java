package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterTest {

	public static void main(String[] args) {

		// BufferedWriter out = null;
		try(BufferedWriter out = new BufferedWriter(new FileWriter("C:\\test\\text2.txt"))) {
			// out = new BufferedWriter(new FileWriter("C:\\test\\text2.txt")); // 기본 스트림 있어야 함
			out.write("홍차(紅茶)는 차잎 내부의 성분이 자체에 들어있는 효소에 산화되어 붉은 빛을 띠는 차를 뜻한다.");
			out.newLine(); // 개행
			out.write("녹차나 보이차와 같이 효소의 작용을 중지시키는 쇄청(曬靑, 햇볕에 쬐어 말림) 과정을 거치지 않기 때문에 잎 자체의 효소로 산화가 된 것이다.");
			out.newLine();
			out.write("홍차도 맛있고 녹차도 맛있다. 지금 먹고있어. 행복해.");
			out.newLine();
			out.newLine();
			out.write("나무위키 참조");
			
			System.out.println("작성 완료!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}


}
