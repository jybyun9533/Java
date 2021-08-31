package collection.test2;

import java.util.ArrayList;

import collection.vo.Person;

public class PersonArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();

		list.add(new Person("��ȣ��", "���ʵ�", 45));
		list.add(new Person("�̼���", "��赿", 42));
		list.add(new Person("��ȣ��", "���ǵ�", 33));
		list.add(new Person("������", "��â��", 40));
		list.add(new Person("����ö", "���ʵ�", 36));

		System.out.println(list);

		// ����Ʈ�� ����ִ� ����� ����ΰ�?
		System.out.println(list.size());

		// ����Ʈ ��ճ���
		int ageSum = 0;
		for (int i = 0; i < list.size(); i++) {
			ageSum += list.get(i).getAge();
		}
		int ageAver = ageSum / list.size();
		System.out.println(ageAver);

		// ���ʵ��� ��»�� ���
		for (Person p : list) {
			if (p.getAddr().equals("���ʵ�")) {
				System.out.println(p);
			}
		}
	}

}
