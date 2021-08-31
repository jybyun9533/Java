package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest2 {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("강호동",48));
		list.add(new Person("이수근",45));
		list.add(new Person("서장훈",38));
		
		//Arrays.sort(배열) | collections.sort(리스트, Comparator객체)
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge()-p2.getAge(); //오름차순
			}
		});
	}

}
