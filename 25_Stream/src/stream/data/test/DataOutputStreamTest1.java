package stream.data.test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * ������ �������� ���Ϸ� ����ϴ� �ڵ� �ۼ�
 * ���࿡ scroe.dat ���� ������ �������� �ʾƼ� ��µǴ� �����޼����� ����
 * ����Ʈ �迭 ��Ʈ���� ��µǴ� ������ ������ ���ڱ���� �ƴ�, Binary Data.
 * ���� ����������� ���Ƶ� �˼� ���� �������� ���� 
 * �׷��� �ᱹ �̸� Ȯ���ϱ� ���ؼ���
 * score.dat���Ͽ� ��µ� Binary Data�� �ٽ� DataInputStream�� ���ؼ� �ڹ� �⺻������ �ڵ���ȯ ���Ѽ� �о�鿩���Ѵ�.
 */

import java.io.IOException;

public class DataOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		int[] scores = { 100, 90, 70, 75, 66 };
		String outFile = "src\\scores.dat";

		DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
		System.out.println("score.dat������ �����Ǿ����ϴ�..");

		for (int score : scores) {
			dos.writeInt(score);
		}
	}

}