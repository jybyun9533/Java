package collection.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		// Order | Sorting
		list.add("∞≠»£µø");
		list.add("¿Ãºˆ±Ÿ");
		list.add("∞≠»£µø");
		list.add("º≠¿Â»∆");
		list.add("±Ë»Ò√∂");

		System.out.println(list);
		String name = list.get(2);
		list.remove(2);
		System.out.println(name);
		list.set(0, "æ∆¿Ã¿Ø");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("º≠¿Â»∆")) {
				System.out.println(list.get(i));
			}
		}
	}
}
