package collection.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<String, Customer>();

		map.put("111", new Customer("KANG", "��ȣ��", 48));
		map.put("222", new Customer("LEE", "�̼���", 44));
		map.put("333", new Customer("SEO", "������", 42));
		map.put("444", new Customer("KIM", "����ö", 37));

		// 1.key���� 222�� ����� ������ ���
		System.out.println(map.get("222"));

		// 2. id�� LEE�� ����� ã�Ƽ� �� ����� �̸��� ���
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String mapKey = it.next();
			if (map.get(mapKey).getId().equals("LEE")) {
				System.out.println(map.get(mapKey).getName());
			}
		}

		// 3. map�� ����� ���key ���
		System.out.println(set);

		// 4. map�� ����� ����� ������ ���հ� ��տ��� ���
		int sum = 0, avg = 0;

		Iterator<String> it2 = set.iterator();
		while (it2.hasNext()) {
			String name = it2.next();
			sum += map.get(name).getAge();
		}
		avg = sum/map.size();
		System.out.println(avg);

	}

}
