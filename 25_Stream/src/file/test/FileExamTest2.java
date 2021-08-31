package file.test;

import java.io.File;
import java.io.IOException;

public class FileExamTest2 {
	public static void main(String[] args) throws IOException {
		String dirName = "c:\\" + File.separator + "dir2" + File.separator + "myDir";
		File file1 = new File(dirName);

		file1.mkdirs();
		File file2 = new File(dirName, "fileTest.dat");

		if (file2.createNewFile()) {
			System.out.println("filseTest Creating OK");
		}

		System.out.println("1. file2 �����̸��� ��� :: " + file2.getName());
		System.out.println("1. file2 ���ϰ�θ� ��� :: " + file2.getPath());
		System.out.println("1. file2 getParent() ��� ��� :: " + file2.getParent());
		
		file2.deleteOnExit();
	}
}
