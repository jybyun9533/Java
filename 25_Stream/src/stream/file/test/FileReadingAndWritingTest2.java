package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���Ͽ� �Էµ� ������ �о �� �ٸ� ���Ϸ� ����ϴ� ������ �ۼ�
 * ::
 * ��Ʈ��
 * �Է� 2�� -- FileReader, BufferedReader
 * ��� 2�� -- FileWriter, BuffererWriter
 * ::
 * 1. ��Ʈ�� ����..4������
 * 2. ������ ������ �о 
 * 3. �Ǵٸ� ���Ϸ� ���(Sink)
 */
public class FileReadingAndWritingTest2 {

	public static void main(String[] args) throws IOException {
		// 1. ��Ʈ������ -- �Է� 2��(fileReader, BufferdReader)
		// 2. while�� ������ ������ �а�
		// 3. �ַܼ� ���

		String path = "C:\\encore_bjy\\eclipse\\01_javaWorkspace\\25_Stream\\src\\stream\\console\\test\\hope.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));

		BufferedWriter bw = new BufferedWriter(new FileWriter("src\\stream\\console\\test\\save.txt"));

		try {
			// 2. while������ ������ ������ �а�
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
