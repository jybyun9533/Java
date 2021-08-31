package collection.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Set�� �ڽ� Ŭ���� HashSet
 * 1. �ߺ� ��� ����
 * 2. ������ ������ �ʴ´�.
 */
public class HashSetTest2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("��ȣ��");
		set.add("�̼���");
		set.add("��ȣ��"); // �ߺ�
		set.add("������");
		set.add("����ö");
		
		System.out.println(set.size());
		// Collection API�� ��ü������ toString�� �������̵� �Ǿ�����.
		System.out.println(set.toString());
		boolean flag = set.contains("�̻��");
		System.out.println("�̻���� ���ԵǾ��� �ִ°�? " + flag);
		System.out.println("set Collection�� �����Ͱ� ����� �ִ°�? " + set.isEmpty());
		set.remove("������");
		System.out.println(set.toString());
		set.clear();
		System.out.println(set.toString());
		System.out.println("set Collection�� �����Ͱ� ����� �ִ°�? " + set.isEmpty());
		
	}

}
