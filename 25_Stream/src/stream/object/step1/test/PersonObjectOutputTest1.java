package stream.object.step1.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * ===Serialization(직렬화) :: Data UnPack===
 * Person객체의 정보를(필드값) 다른곳(Sink::Person.obj)으로 날리는 로직을 작성
 * 1. Stream 객체를 생성 -> ObjectOutputStream | FileOutputStream
 * 2. 날린다, 뿌린다, 출력한다 -> ObjectOutputStream의 기능을사용(writeObject(obj))
 */

public class PersonObjectOutputTest1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:" + File.separator + "objfile" + File.separator + "person.obj");

		f.getParentFile().mkdirs(); // 디렉토리 생성
		// 1.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));

		// 2.
		Person p = new Person("김연아", 30, "2233", "여의도");
		oos.writeObject(p);
		
		// 3. 
		oos.close();
		System.out.println("person.obj파일이 생성...확인...");
		System.out.println("정보가 정확하게 출력되었는지는... 추후에 역직렬화해서 정보를 확인해보겠다.");

	}

}
