package chap12;

abstract class A1 {
	abstract void abc();
}

public class AbstractClass2 {
	public static void main(String[] args) {
		A1 a1 = new A1 () {
			void abc() {
				System.out.println("��� 2. �͸� �̳� Ŭ���� ������� ��ü ����");
			}
		};
		
		A1 a2 = new A1() {
			void abc() {
				System.out.println("��� 2. �͸� �̳� Ŭ���� ������� ��ü ����");
			}
		};
		
		a1.abc();
		a2.abc();
	}

}
