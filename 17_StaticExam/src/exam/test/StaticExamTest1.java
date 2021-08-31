package exam.test;
/*
 *  #### Static�� Ű���� ���� ####
 *  1. ��ü���� ���� ���� �޸𸮿� �ö󰣴�.
 *  2. ��ü���� ���� �ξ� ������ Class File Loader������ �޸𸮿� �ö󰣴�
 *     JVM(STACK|HEAP(newŰ����� ������ ��ü��)|....Class Area(static�� ��¡���� ���))
 *  3. ��static�� ������ �ʵ�� ������ ��ü�鿡�� ���� �����Ѵ�.��
 *  4. static�� static���� ���Ѵ�
 *  5. static ��� �ȿ����� this ����� �ȵȴ�.
 *  6. static�� final�� ������ ���� �Բ� ���ȴ�. 
 *     ex) ����� ���� : static final int BASIC_SALARY = 1000;
 *  7. static initialization block
 *  8. �̱���
 */

class Member {
	// �ʵ� ������ static ������ ����(local level�δ� ����Ҽ� ����.)
	static String name = "ȫ�浿";
	static int age = 22;

	int count = 1;

	public static void getMember() { // static block
		System.out.println("��/��/��/��/ " + name); //static variable
		//System.out.println("��/��/��/��/ " + count); 
	}
	
	public void getMember2() { // non-static block
		System.out.println("��/��/��/��/ " + name); //static variable
		System.out.println("��/��/��/��/ " + count); 
	}
}

public class StaticExamTest1 {

	public static void main(String[] args) {
		//static�� ������ ����� �ٷ� �����ؼ� ����Ҽ� �ִ�. Class.Method.
		Member.getMember();

		Member m = new Member();
		m.getMember();
		
	}

}
