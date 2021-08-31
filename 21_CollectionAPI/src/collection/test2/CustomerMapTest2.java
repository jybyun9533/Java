package collection.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<String, Customer>();

		map.put("111", new Customer("KANG", "강호동", 48));
		map.put("222", new Customer("LEE", "이수근", 44));
		map.put("333", new Customer("SEO", "서장훈", 42));
		map.put("444", new Customer("KIM", "김희철", 37));

		// 1.key값이 222인 사람의 정보를 출력
		System.out.println(map.get("222"));

		// 2. id가 LEE인 사람을 찾아서 그 사람의 이름을 출력
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String mapKey = it.next();
			if (map.get(mapKey).getId().equals("LEE")) {
				System.out.println(map.get(mapKey).getName());
			}
		}

		// 3. map에 저장된 모든key 출력
		System.out.println(set);

		// 4. map에 저장된 사람들 나이의 총합과 평균연령 출력
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
