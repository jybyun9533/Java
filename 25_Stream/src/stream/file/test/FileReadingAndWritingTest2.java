package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 파일에 입력된 내용을 읽어서 또 다른 파일로 출력하는 로직을 작성
 * ::
 * 스트림
 * 입력 2개 -- FileReader, BufferedReader
 * 출력 2개 -- FileWriter, BuffererWriter
 * ::
 * 1. 스트림 생성..4개생성
 * 2. 파일의 내용을 읽어서 
 * 3. 또다른 파일로 출력(Sink)
 */
public class FileReadingAndWritingTest2 {

	public static void main(String[] args) throws IOException {
		// 1. 스트림생성 -- 입력 2개(fileReader, BufferdReader)
		// 2. while문 파일의 내용을 읽고
		// 3. 콘솔로 출력

		String path = "C:\\encore_bjy\\eclipse\\01_javaWorkspace\\25_Stream\\src\\stream\\console\\test\\hope.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));

		BufferedWriter bw = new BufferedWriter(new FileWriter("src\\stream\\console\\test\\save.txt"));

		try {
			// 2. while문에서 파일의 내용을 읽고
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.write("\n");
			}
		} finally {
			br.close();
			bw.close();
		}
	}

}
