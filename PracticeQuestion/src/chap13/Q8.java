package chap13;

class A4 {
	interface B4{
		static void bcd() {
			System.out.println("�̳� �������̽� �� static �޼���");
		}
	}
}

public class Q8 {
	public static void main(String[] args) {
		//�̳� �������̽��� static �޼��� ȣ��
		A4.B4.bcd();
	}
}
