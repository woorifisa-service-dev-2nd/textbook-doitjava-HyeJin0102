package chap13;

class A4{
	interface B4{ //�̳� �������̽�. �տ� static ���� �Ǿ� ����
		public abstract void bcd();
	}
}

class C4 implements A4.B4 {
	public void bcd() {
		System.out.println("�̳� �������̽� ���� Ŭ���� ����");
	}
}

public class CreateObjctOfInnerInterface {
	public static void main(String[] args) {
//		A4.B4 ab = new C4(); //�ش� �κ��� ��� �� ���ư��µ�, �� �κ��� �� �ִ� �ɱ�?
		C4 c = new C4(); //�ڽ� Ŭ���� ���� ����
		c.bcd();
		A4.B4 b = new A4.B4() { //�͸� �̳� Ŭ���� ����
			public void bcd() {
				System.out.println("�͸� �̳� Ŭ������ ��ü ����");
			}
		};
		b.bcd();
	}
}