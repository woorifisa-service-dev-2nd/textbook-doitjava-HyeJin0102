package chap13;

class A2 {
	static class B2 {
		void bcd() {
			System.out.println("���� �̳� Ŭ������ �޼���");
		}
	}
}

public class Q4 {
	public static void main(String[] args) {
		//���� �̳� Ŭ���� B�� ��ü ����(���� ������ ab)
		A2.B2 ab = new A2.B2();
		ab.bcd();
	}

}
