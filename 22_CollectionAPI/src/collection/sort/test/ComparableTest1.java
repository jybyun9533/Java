package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Arrays.sort(xxx[]) -> sort()�� Comparable�� ���ؼ� ���ĵ� ��.
 * Arrays.sort(arraylist) �� �ȵ��ư� 
 * -> list�� Collections.sort ���
 * => Comparable�� ����ؼ� ArrayList���� ��ü���� Ư���� ���� ���ؼ� ����
 * 
 * 1. Comparable�� ���� ��ӹ޾Ƽ� �����ϴ� ���
 *  -> compareTo�� �����ϰ���� �ʵ�(���̼�, �̸���)�� ���缭 ���� (�⺻�� ��������, �տ� -�� ���̸� ��������)
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
//	public int compareTo(Person p) { //�̸��� ����
//		return -name.compareTo(p.getName());
//	}

	@Override
	public int compareTo(Person p) { // ���̼�
		return -new Integer(age).compareTo(p.getAge());
	}

}

public class ComparableTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("��ȣ��", 48));
		list.add(new Person("�̼���", 45));
		list.add(new Person("������", 38));

		Collections.sort(list);
		System.out.println(list);

	}

}
