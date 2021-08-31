package stream.console.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Ű����� �о���� �����͸� �ַܼ� ���(sysout)�ϴ� ������ �ۼ�
 * <�ҽ��ڵ� ����>
 * 1. ��Ʈ�� ��ü ����
 * 2. �б�
 * 3. �ַܼ� ���
 */
public class KeyboardInputTest1 {

	public static void main(String[] args) {
		// 1. �Է� ��Ʈ���� �ʿ�..2��(�⺻(node), ����(filter))
		System.out.println("1. ��Ʈ�� ����");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		// 2. ������ ��Ʈ���� ����� ���.. �о���δ�.
		System.out.println("2. �����͸� �о���δ�..�����͸� Ű����� �Է��ϼ���>>");
		try {
			String line = br.readLine();
			while (line != null) {
				// 3. �о���� �����͸� �ַܼ� ���
				System.out.println("Reading Data :: " + line);
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ir.close(); // �ʿ����.
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// main

}
