package looping.test;

/*
 * 반복문 중에서 가장 많이 사용되는 for문이
 * 어떻게 동작하는지 정학하게 이해한다.
 */

public class LoopingBasicTest1 {

	public static void main(String[] args) {
		
		System.out.println("========for=======");
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello Looping" + i);
		}
		System.out.println();		
		
		System.out.println("========while=======");
		int i=0;
		while(i<10) {
			System.out.println("Hello while looping" + i);
			i++;
		}
		System.out.println();
	
		
		System.out.println("========do while=======");
		int j=10;
		do {
			System.out.println(j+" Always Print");
			j++;
		}while(j<10);
		System.out.println();
		
		
		
		
	}

	private static Thread Thread() {
		// TODO Auto-generated method stub
		return null;
	}

}
