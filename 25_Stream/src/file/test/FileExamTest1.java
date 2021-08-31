package file.test;

import java.io.File;

/*
 * 파일 = 디렉토리정보 + 파일명 
 * 해당 클래스에서는 파일을 다양한 방법으로 생성
 * getParentFile() : File, getParent() : String
 * 
 * mkdir(), mkdirs() 함수의 기능을 자세히 알아보는 로직을 작성
 * 
 */
public class FileExamTest1 {

	public static void main(String[] args) {
		File dir = new File("c:\\filetest"); // 머신에선 파일명과 디렉토리는 구분 X
		File dir2 = new File("c:\\filetest1\\step1\\code");
		File dir3 = new File("c:\\filetest1\\exam\\data.dat"); // data.dat이라는 폴더가 만들어짐

		System.out.println("파일이 생성되었나요?");

		// dir.mkdir(); // 폴더 하나일 경우 (굳이 쓸 필요X)
		dir2.mkdirs(); // 여러 폴더일 경우
		dir3.getParentFile().mkdirs();
		//getParent()는 String 타입으로써 file 메소드를 사용X -> 잘 사용하지않음.
		
		
	}

}
