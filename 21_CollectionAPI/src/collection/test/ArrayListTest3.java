package collection.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		// Order | Sorting
		list.add("��ȣ��");
		list.add("�̼���");
		list.add("��ȣ��");
		list.add("������");
		list.add("����ö");

		System.out.println(list);
		String name = list.get(2);
		list.remove(2);
		System.out.println(name);
		list.set(0, "������");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("������")) {
				System.out.println(list.get(i));
			}
		}
	}
}
