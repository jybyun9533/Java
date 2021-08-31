package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Arrays.sort(xxx[]) -> sort()는 Comparable에 의해서 정렬된 것.
 * Arrays.sort(arraylist) 는 안돌아감 
 * -> list는 Collections.sort 사용
 * => Comparable을 사용해서 ArrayList안의 객체들을 특정한 값에 의해서 정렬
 * 
 * 1. Comparable을 직접 상속받아서 구현하는 방법
 *  -> compareTo를 정렬하고싶은 필드(나이순, 이름순)에 맞춰서 구현 (기본은 오름차순, 앞에 -를 붙이면 내림차순)
 */

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(Person p) { //이름순 정렬
//		return -name.compareTo(p.getName());
//	}

	@Override
	public int compareTo(Person p) { // 나이순
		return -new Integer(age).compareTo(p.getAge());
	}

}

public class ComparableTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("강호동", 48));
		list.add(new Person("이수근", 45));
		list.add(new Person("서장훈", 38));

		Collections.sort(list);
		System.out.println(list);

	}

}
