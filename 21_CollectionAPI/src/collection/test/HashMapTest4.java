package collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map의 자식클래스.. HashMap
 * key-value를 쌍으로 연결해서 데이터를 저장하는 특징을 가진다
 * key는 중복을 허용하지 않고 value는 중복 가능하다
 * 순서는 없다.
 */

public class HashMapTest4 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("강호동", 90);
		map.put("이수근", 95);
		map.put("서장훈", 99);
		map.put("김희철", 80);

		
		int sum =0;
		
		System.out.println("===keySet()===");
		Set<String> set = map.keySet();
		System.out.println(set);

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String name = it.next();
			sum+= map.get(name);
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/map.size());

		System.out.println("===entrySet()===");
		
		System.out.println("=========values()========");
		Collection<Integer> col = map.values(); 
		Iterator<Integer> it2 = col.iterator();
		
		int sum1=0;
		while(it2.hasNext()) {
			sum1+=it2.next();
		}
		
		System.out.println(sum1);
		System.out.println(sum1/map.size());
		System.out.println("최고성적은 "+ Collections.max(col));
		System.out.println("최저성적은 "+ Collections.min(col));
	}

}
