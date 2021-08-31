package collection.test2;

import java.util.ArrayList;

import collection.vo.Person;

public class PersonArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();

		list.add(new Person("강호동", "서초동", 45));
		list.add(new Person("이수근", "방배동", 42));
		list.add(new Person("강호동", "여의동", 33));
		list.add(new Person("서장훈", "평창동", 40));
		list.add(new Person("김희철", "서초동", 36));

		System.out.println(list);

		// 리스트에 들어있는 사람이 몇명인가?
		System.out.println(list.size());

		// 리스트 평균나이
		int ageSum = 0;
		for (int i = 0; i < list.size(); i++) {
			ageSum += list.get(i).getAge();
		}
		int ageAver = ageSum / list.size();
		System.out.println(ageAver);

		// 서초동에 사는사람 출력
		for (Person p : list) {
			if (p.getAddr().equals("서초동")) {
				System.out.println(p);
			}
		}
	}

}
