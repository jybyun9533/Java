package stream.file.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingTest1 {

	public static void main(String[] args) throws IOException {
		// 1. ��Ʈ������ -- �Է� 2��(fileReader, BufferdReader)
		// 2. while�� ������ ������ �а�
		// 3. �ַܼ� ���

		String path = "C:\\encore_bjy\\eclipse\\01_javaWorkspace\\25_Stream\\src\\stream\\console\\test\\hope.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));

		try {
			// 2. while������ ������ ������ �а�
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			br.close();
		}
	}

}
