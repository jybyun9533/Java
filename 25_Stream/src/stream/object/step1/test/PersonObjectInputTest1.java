package stream.object.step1.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ������ȭ �ڵ�
 * ������ Person.obj������ ������ �о�ͼ� �ַܼ� ���
 */
public class PersonObjectInputTest1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		File f = new File("C:" + File.separator + "objfile" + File.separator + "person.obj");

		// 1.
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		System.out.println("������");

		// 2.
		Person p = (Person) ois.readObject();
		System.out.println(p);

	}

}
