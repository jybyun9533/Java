package stream.data.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

/*
 * ������ �������� ���Ϸ� ����ϴ� �ڵ� �ۼ�
 * ���࿡ scroe.dat ���� ������ �������� �ʾƼ� ��µǴ� �����޼����� ����
 * ����Ʈ �迭 ��Ʈ���� ��µǴ� ������ ������ ���ڱ���� �ƴ�, Binary Data.
 * ���� ����������� ���Ƶ� �˼� ���� �������� ���� 
 * �׷��� �ᱹ �̸� Ȯ���ϱ� ���ؼ���
 * score.dat���Ͽ� ��µ� Binary Data�� �ٽ� DataInputStream�� ���ؼ� �ڹ� �⺻������ �ڵ���ȯ ���Ѽ� �о�鿩���Ѵ�.
 */

import java.io.IOException;

public class DataOutputStreamTest5 {

	public static void main(String[] args) throws IOException {
		String path = "src\\watermelon.png";
		int data = 0;

		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			dis = new DataInputStream(new FileInputStream(path));
			dos = new DataOutputStream(new FileOutputStream("src\\water.png"));

			// dos.write(dis.readAllBytes());

			while ((data = dis.readInt()) != -1) {
				dos.writeInt(data);
			}

		} catch (EOFException e) {

		} finally {
			dis.close();
			dos.close();
		} // fin

	}// main
}// class
