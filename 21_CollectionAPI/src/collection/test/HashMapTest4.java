package collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map�� �ڽ�Ŭ����.. HashMap
 * key-value�� ������ �����ؼ� �����͸� �����ϴ� Ư¡�� ������
 * key�� �ߺ��� ������� �ʰ� value�� �ߺ� �����ϴ�
 * ������ ����.
 */

public class HashMapTest4 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("��ȣ��", 90);
		map.put("�̼���", 95);
		map.put("������", 99);
		map.put("����ö", 80);

		
		int sum =0;
		
		System.out.println("===keySet()===");
		Set<String> set = map.keySet();
		System.out.println(set);

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String name = it.next();
			sum+= map.get(name);
		}
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum/map.size());

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
		System.out.println("�ְ����� "+ Collections.max(col));
		System.out.println("���������� "+ Collections.min(col));
	}

}
