package stream.object.step1.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * ===Serialization(����ȭ) :: Data UnPack===
 * Person��ü�� ������(�ʵ尪) �ٸ���(Sink::Person.obj)���� ������ ������ �ۼ�
 * 1. Stream ��ü�� ���� -> ObjectOutputStream | FileOutputStream
 * 2. ������, �Ѹ���, ����Ѵ� -> ObjectOutputStream�� ��������(writeObject(obj))
 */

public class PersonObjectOutputTest1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:" + File.separator + "objfile" + File.separator + "person.obj");

		f.getParentFile().mkdirs(); // ���丮 ����
		// 1.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));

		// 2.
		Person p = new Person("�迬��", 30, "2233", "���ǵ�");
		oos.writeObject(p);
		
		// 3. 
		oos.close();
		System.out.println("person.obj������ ����...Ȯ��...");
		System.out.println("������ ��Ȯ�ϰ� ��µǾ�������... ���Ŀ� ������ȭ�ؼ� ������ Ȯ���غ��ڴ�.");

	}

}
