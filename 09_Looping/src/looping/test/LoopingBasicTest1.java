package looping.test;

/*
 * �ݺ��� �߿��� ���� ���� ���Ǵ� for����
 * ��� �����ϴ��� �����ϰ� �����Ѵ�.
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
