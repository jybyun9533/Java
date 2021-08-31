package stream.object.step1.test;

import java.io.Serializable;

/*
 * Person클래스 타입의 객체는 
 * ObjectInputStream, ObjectOutputStream을 통해서 정보(class필드)가
 * 입력, 출력되는 객체이다.
 * 
 * 이 클래스 타입의 객체가 스트림을 통과하려면 반드시 Serializable이라는 인터페이스를 상속받아서 정의되어야 한다.
 * -> Serializable인터페이스를 구현한 클래스의 필드는 객체스트림을 통과할 수 있다.
 */
public class Person implements Serializable {
	private String name;
	private int age;
	private String password;
	private String address;

	public Person() {

	}

	public Person(String name, int age, String password, String address) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + ", address=" + address + "]";
	}

}
