package stream.file.test;
/*
 * hope.txt파일의 문자데이터를 읽어서 --- FileReader(Character계열)
 * 다른 경로의 result.txt 파일로 문제데이터 출력 --- FileWriter(Character계열)
 * ::
 * <스트림 코드 작성 패턴>
 * 1. 입력, 출력 스트림 생성
 * 2. 반복문 안에서 데이터를 전부 읽음
 * 3. 반복문 안에서 읽어들인 데이터를 Sink방향으로 출력
 *  -> 문자 데이터를 출력할때 읽어들이는 족족 출력하지 않고
 *     일정량만큼 모아두었다가 한꺼번에 출력하는 패턴을 보임
 *     1) auto flush기능 -- flush()
 *     2) 자원을 닫을때 그 안에 있는 데이타를 한번에 출력 -- close()
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class FileReadWriterReview {
	public FileReadWriterReview() throws IOException {

		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("src\\hope.txt"));
			pw = new PrintWriter(new FileWriter("C:\\data\\result.txt"));

			String line = "";
			while ((line = br.readLine()) != null) {
				pw.println(line);
			}
		} finally {
			br.close();
			pw.close();
		}

	}
}

public class FileReadWriterReviewTest4 {

	public static void main(String[] args) throws IOException {
		new FileReadWriterReview();

	}

}
