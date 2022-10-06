package chapter12;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

		// File 클래스 : 경로를 다루는 클래스 
		// 파일과 폴더를 다루는 기능을 사용한다!
		
		File dir1 = new File("c:\\test");
		
		System.out.println("존재 여부 : " + dir1.exists());
		System.out.println("폴더인지 여부 : " + dir1.isDirectory());
		System.out.println("파일인지 여부 : " + dir1.isFile());
		
		// 존재 여부 확인하고 새 폴더 만들기 
		File dir2 = new File("c:\\test//backup");
		System.out.println("존재 여부 : " + dir2.exists());
		
		// 폴더가 존재하지 않으면 새로운 폴더를 생성 
		if(!dir2.exists()) {
			System.out.println("폴더가 존재하지 않습니다. 새로운 폴더를 생성합니다. ");
			dir2.mkdir(); 
			System.out.println("폴더가 생성되었습니다. ");
		}else {
			System.out.println("폴더가 존재합니다. ");
		}
		
		// 파일 확인
		File file1 = new File(dir2, System.currentTimeMillis() + "test.text"); // File(부모디렉토리(폴더), 파일) -> 가능 
		System.out.println("파일 존재 여부 : " + file1.exists());
		System.out.println(file1);
		
		System.out.println();
		System.out.println("c:\test 폴더의 파일 리스트 =============");
		File[] list = dir1.listFiles();
		for(int i=0; i<list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.print("[DIR]");
			} else if(list[i].isFile()) {
				System.out.print("[FILE]");
			}
			System.out.println(list[i].getName());
		}
		
		// 파일 지우기
		File delFile = new File(dir1, "testCopy1.pdf");
		System.out.println("\ntestCopy1.pdf 파일 존재 여부 : " + delFile.exists());
		
		if(delFile.exists()) {
			delFile.delete();
			System.out.println("파일이 삭제되었습니다. ");
			System.out.println("testCopy1.pdf 파일 존재 여부 : " + delFile.exists());
		} else {
			System.out.println("삭제할 파일이 존재하지 않습니다!");
		}
		
		// 파일 이동하기
		System.out.println();
		System.out.println("test 폴더 안에 있는 모든 파일을 backup 폴더로 이동");
		
		list = dir1.listFiles();
		for(int i=0; i<list.length; i++) {
			// 파일만 이동 할 수 있도록 하는 조건 
			if(list[i].isFile()) {
				// 옮겨야 할 경로 
				File newFile = new File(dir2, list[i].getName());
				//이동
				list[i].renameTo(newFile); // 
				System.out.println("+ " + list[i].getName() + "파일이 이동했습니다. ");
			} 
		}
		System.out.println("test 폴더 내부의 모든 파일이 test/backup 폴더로 이동되었습니다. ");
		//백업폴더 확인		
		System.out.println("c:\\test\\backup 폴더의 파일 리스트");
		File[] newlist = dir2.listFiles();
		for(int i=0; i<newlist.length; i++) {
			if(newlist[i].isDirectory()) {
				System.out.print("[DIR]");
			} else if(newlist[i].isFile()) {
				System.out.print("[FILE]");
			}
			System.out.println(newlist[i].getName());
		}
	}

}
