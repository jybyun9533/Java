package stream.console.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. ��Ʈ�� ��ü�� ����.. �Է�, ���
 * 2. while�� �ȿ��� ��� �о���̰�
 * 3. ���� �����͸� ���
 *  -> Ű����� �Է��� �����͸� �ַܼ� ����ϴ� ������ �ۼ�
 * �Է� -- 2�� - InputStreamReader, BufferedReader
 * ��� -- X�� - Sysout();
 */
public class KeyboardInputTest2 {

	public static void mFain(String[] args) throws IOException {
		// 1.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("InputStream Creating...Ű����� ������ �Է�..\n");

		// 2.
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				System.out.println("Reading Data::" + line);
			}

		} finally {
			br.close();
		}

	}// main

}
