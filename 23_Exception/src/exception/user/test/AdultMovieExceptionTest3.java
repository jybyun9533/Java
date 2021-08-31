package exception.user.test;

import java.util.Scanner;

/*
 * ��������� Exception
 * 1. ���� Ŭ������ ���� ���� �ۼ��ؼ� ���
 *  -> Class A extends Exception{}
 * 2. ������ ������� ����
 *  -> Ư���� ������ �����Ǹ� ���ܸ� ���������� �߻����� ���α׷��� �ڵ鸵��
 *  
 *  -----------------------------------------------------------
 *  ���ο�ȭ�� �����ϴµ� ���̰� 19���� �ȵǴ� ����� ���忡 ������ ��� �������
 *  19�� �̻��� ����� ��ȭ������ ����ϴ� ����
 *  --> 
 *  UnderAgeException�� �����ؼ� ����ϰڴ�.
 *  
 */

class UnderAgeException extends Exception {

	UnderAgeException() {
		this("�̼����ڴ� ������ �� �����ϴ�.");
	}

	UnderAgeException(String message) {
		super(message);
	}
}

class AdultMovieService {
	public void entrance(int age) throws UnderAgeException {
		if (age < 19) {
			throw new UnderAgeException();
		} else
			System.out.println("���� �����մϴ�.");
	}
}

public class AdultMovieExceptionTest3 {

	public static void main(String[] args) {
		System.out.println("���� ���̸� �Է��Ͻÿ�.");

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		AdultMovieService service = new AdultMovieService();
		try {
			service.entrance(age);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
