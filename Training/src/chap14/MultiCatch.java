package chap14;

public class MultiCatch {

	public static void main(String[] args) {
		
		//1.���� try-catch
		try {
			System.out.println(3/0);
		}
		catch (ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
		
		try {
			int num = Integer.parseInt("10A");
		}
		catch (NumberFormatException e) {
			System.out.println("���ڷ� �ٲ� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
		System.out.println();
		
		//2.���� try-catch
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("10A"); //
		}
		catch (ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		catch (NumberFormatException e) { //if���� else�� ���� ����
			System.out.println("���ڷ� �ٲ� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
		
		//3.OR �������� ������ ���� catch ����
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("10A"); //
		}
		catch (ArithmeticException | NumberFormatException e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
	}

}
