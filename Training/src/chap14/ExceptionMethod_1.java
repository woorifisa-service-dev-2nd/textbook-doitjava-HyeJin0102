package chap14;

public class ExceptionMethod_1 {
	public static void main(String[] args) {
		
		//1. ���� ��ü�� �������� �� �޽����� �������� �ʾ��� ���
		try {
			throw new Exception(); //���� ��
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// 2.���� ��ü�� �������� �� �޽����� �������� ���
		try {
			throw new Exception("���� �޽���"); //���� �߻�
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
