package chap13;

interface A3 {
	public abstract void abc();
}

class C3 {
	void cde(A3 a) {
		a.abc(); 
	}
}

public class AnonymousClass_3 {
	public static void main(String[] args) {
		C3 c = new C3(); //��� 3. Ŭ������X + ���� ������O
		A3 a = new A3() {
			public void abc() {
				System.out.println("�Է¸Ű����� ����");
			}
		};
		c.cde(a); 
		c.cde(new A3() { //���4. Ŭ������X + ���� ������X
			public void abc() {
				System.out.println("�Է� �Ű����� ����");
			}
		});
	}

}
