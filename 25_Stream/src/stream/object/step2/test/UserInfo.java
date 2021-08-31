package stream.object.step2.test;

import java.io.Serializable;

public class UserInfo implements Serializable {
	public static final String DEFAULT_NAME = "홍길동";
	public static final int DEFAULT_AGE = 19;
	private String name;
	private int age;
	
	/*
	 * password처럼 보안에 취약한 필드는
	 * transient를 사용한다
	 * 이를 사용하면 stream을 지날시 기본값으로 바뀌어서 전송된다. 
	 */
	
	transient String password;

	public UserInfo(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public UserInfo() {
		this(DEFAULT_NAME, DEFAULT_AGE, "1234");
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

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", password=" + password + "]";
	}

}
