package chap13;

interface A2 {
	public abstract void abc();
}

class B2 implements A2 { //�ڽ� Ŭ���� ���� ����
	public void abc() {
		System.out.println("�Է¸Ű����� ����");
	}
}

class C2 {
	void cde(A2 a) { //�Ű������� �ڽ�Ŭ���� �����ڷη� ������ AŸ���� a �Ѱ���. (A2�� abc�� B2�� abc�� �������̵� �Ǿ� ����)
		a.abc(); //�ش� �Ű������� ����� �޼��� ȣ��
	}
}

public class AnonymousClass_2 {
	public static void main(String[] args) {
		C2 c = new C2(); //��� 1. Ŭ������O + ���� ������O
		A2 a = new B2(); //���2. Ŭ������O + ����������X
		c.cde(a); 
		c.cde(new B2());
	}

}
