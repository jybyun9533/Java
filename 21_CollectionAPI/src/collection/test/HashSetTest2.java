package collection.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Set의 자식 클래스 HashSet
 * 1. 중복 허용 안함
 * 2. 순서를 가지지 않는다.
 */
public class HashSetTest2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("강호동");
		set.add("이수근");
		set.add("강호동"); // 중복
		set.add("서장훈");
		set.add("김희철");
		
		System.out.println(set.size());
		// Collection API는 자체적으로 toString이 오버라이딩 되어있음.
		System.out.println(set.toString());
		boolean flag = set.contains("이상민");
		System.out.println("이상민이 포함되어져 있는가? " + flag);
		System.out.println("set Collection에 데이터가 비어져 있는가? " + set.isEmpty());
		set.remove("서장훈");
		System.out.println(set.toString());
		set.clear();
		System.out.println(set.toString());
		System.out.println("set Collection에 데이터가 비어져 있는가? " + set.isEmpty());
		
	}

}
