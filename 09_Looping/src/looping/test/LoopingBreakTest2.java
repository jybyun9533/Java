package looping.test;

/*
 * for���� �̿��ؼ� 1~100������ ������ ���ϴ� ������ �ۼ� 
 * ������ �ϳ� �� �߰��Ѵ�.
 *  - ������ 500�� �Ѿ�� �ݺ��� �ߴ��ϰ� break
 *    �׶��� ���հ� i���� ���
 */
public class LoopingBreakTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0; // localV... �⺻���� ���⶧���� �ݵ�� �ʱ�ȭ �ϰ� ���

		for (int i = 1; i <= 100; i++) {
			sum += i;

			if (sum > 500) {
				break;
			}
		}
		System.out.println("1~100������ �� ���� : " + sum);
	}

}
