package sample;

/*
 * �ʵ忡 ���� �Է��ϴ� ����� �߰�
 * 
 * [simple | detail(o)]
 * setInfo()
 * inputField()
 * 
 */

public class MyStudent2 {

	public String name, address;
	public int age;
	
	public void setField(String n, int a, String add) {
		name = n;
		age = a;
		address = add;
	}
	
	public void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
	}

}
