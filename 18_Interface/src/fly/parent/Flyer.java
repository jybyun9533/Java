package fly.parent;
// ������ �Ͱ� ���õ� ����� ��Ƴ��� Interface

public interface Flyer {
	/*
	 * �ʵ�� ������ ����� ����.
	 * 1. static final ���
	 * 2. public abstract �޼ҵ�
	 */
	public static final int SIZE = 100;
	
	public abstract void fly(); // ����θ� �ְ� ������({...})�� ���� �޼ҵ�

	void land(); // ������ �޼ҵ� ����Ÿ�� �տ� public abstract ��������

	void takeOff();

}
