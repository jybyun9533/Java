package stream.object.step1.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 역직렬화 코드
 * 생성된 Person.obj파일의 내용을 읽어와서 콘솔로 출력
 */
public class PersonObjectInputTest1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		File f = new File("C:" + File.separator + "objfile" + File.separator + "person.obj");

		// 1.
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		System.out.println("생성됨");

		// 2.
		Person p = (Person) ois.readObject();
		System.out.println(p);

	}

}
