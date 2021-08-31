package stream.file.test;
/*
 * hope.txt������ ���ڵ����͸� �о --- FileReader(Character�迭)
 * �ٸ� ����� result.txt ���Ϸ� ���������� ��� --- FileWriter(Character�迭)
 * ::
 * <��Ʈ�� �ڵ� �ۼ� ����>
 * 1. �Է�, ��� ��Ʈ�� ����
 * 2. �ݺ��� �ȿ��� �����͸� ���� ����
 * 3. �ݺ��� �ȿ��� �о���� �����͸� Sink�������� ���
 *  -> ���� �����͸� ����Ҷ� �о���̴� ���� ������� �ʰ�
 *     ��������ŭ ��Ƶξ��ٰ� �Ѳ����� ����ϴ� ������ ����
 *     1) auto flush��� -- flush()
 *     2) �ڿ��� ������ �� �ȿ� �ִ� ����Ÿ�� �ѹ��� ��� -- close()
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
