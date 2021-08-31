package stream.data.test;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
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

public class DataOutputStreamTest4 {

	public static void main(String[] args) throws IOException {
		int sum = 0;
		int score = 0;
		DataInputStream dis = null;

		try {
			dis = new DataInputStream(new FileInputStream("src\\scores.dat"));
			System.out.println("Stream Generated");
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum+= score;
			}
		}catch(EOFException e) {
			System.out.println("��� ������ �� : " + sum);
		}finally {
			dis.close();
		}//fin
		
	}// main
}// class
