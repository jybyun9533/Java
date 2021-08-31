package stream.data.test;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

/*
 * ������ �������� ���Ϸ� ����ϴ� �ڵ� �ۼ�
 * ���࿡ scroe.dat ���� ������ �������� �ʾƼ� ��µǴ� �����޼����� ����
 * ����Ʈ �迭 ��Ʈ���� ��µǴ� ������ ������ ���ڱ���� �ƴ�, Binary Data.
 * ���� ����������� ���Ƶ� �˼� ���� �������� ���� 
 * �׷��� �ᱹ �̸� Ȯ���ϱ� ���ؼ���
 * score.dat���Ͽ� ��µ� Binary Data�� �ٽ� DataInputStream�� ���ؼ� �ڹ� �⺻������ �ڵ���ȯ ���Ѽ� �о�鿩���Ѵ�.
 */

import java.io.IOException;

public class DataOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		String file = "src\\scores.dat";

		DataInputStream dis = null;

		int data = 0;
		try {
			dis = new DataInputStream(new FileInputStream(file));
			while ((data = dis.readInt()) != -1) { // int�� ������ ���� -1 .
				System.out.println(data);
			}
		} catch (EOFException e) {

		} finally {
			dis.close();
		}
	}
}
