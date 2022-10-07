package chapter15;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) {

		String urlStr = "https://n.news.naver.com/mnews/article/584/0000008620?sid=105";
		
		try {
			URL url1 = new URL(urlStr);
			System.out.println(url1.getProtocol());
			System.out.println(url1.getHost()); // 도메인 이름 추출 
			System.out.println(url1.getPort()); // 기본포트 -1
			System.out.println(url1.getDefaultPort());
			System.out.println(url1.getPath());
			System.out.println(url1.getQuery()); // 파라미터 추출 
			System.out.println(url1.getFile()); // 경로/파일
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}

}
