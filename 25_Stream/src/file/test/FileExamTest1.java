package file.test;

import java.io.File;

/*
 * ���� = ���丮���� + ���ϸ� 
 * �ش� Ŭ���������� ������ �پ��� ������� ����
 * getParentFile() : File, getParent() : String
 * 
 * mkdir(), mkdirs() �Լ��� ����� �ڼ��� �˾ƺ��� ������ �ۼ�
 * 
 */
public class FileExamTest1 {

	public static void main(String[] args) {
		File dir = new File("c:\\filetest"); // �ӽſ��� ���ϸ�� ���丮�� ���� X
		File dir2 = new File("c:\\filetest1\\step1\\code");
		File dir3 = new File("c:\\filetest1\\exam\\data.dat"); // data.dat�̶�� ������ �������

		System.out.println("������ �����Ǿ�����?");

		// dir.mkdir(); // ���� �ϳ��� ��� (���� �� �ʿ�X)
		dir2.mkdirs(); // ���� ������ ���
		dir3.getParentFile().mkdirs();
		//getParent()�� String Ÿ�����ν� file �޼ҵ带 ���X -> �� �����������.
		
		
	}

}
