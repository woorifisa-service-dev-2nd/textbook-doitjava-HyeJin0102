package chap13;

class A1 {
	C1 c = new C1() { //CŸ�� ������ ȣ�� �� �߰�ȣ �ȿ� �������̽� ���Ե� �߻� �޼��� bcd() ������ ǥ����. �������̽� C�� ��ӹ��� ��ü ������ ���������� ������
		public void bcd() {
			System.out.println("�͸� �̳� Ŭ����");			
		}
	};
	void abc() {
		c.bcd();
	}
}	

interface C1 {
	public abstract void bcd();
}


public class AnonymousClass {
	public static void main(String[] args) {
		A1 a = new A1();
		a.abc();
	}
}
