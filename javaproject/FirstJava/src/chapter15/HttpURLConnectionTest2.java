package chapter15;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class HttpURLConnectionTest2 {
	
	public static void main(String[] args) {
		
		String urlStr = "https://www.google.com";
		
		try {
			URL url = new URL(urlStr);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			InputStream in = connection.getInputStream();
			
			for(int i=1; i<8; i++) {
				System.out.println(connection.getHeaderFieldKey(i) + " = " + connection.getHeaderField(i));
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
