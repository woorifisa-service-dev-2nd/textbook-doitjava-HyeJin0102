package chap14;

class A5 {
	void abc() throws NumberFormatException {
		bcd();
	}
	
	void bcd() throws NumberFormatException {
		cde();
	}
	
	void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");
	}
}

public class ExceptionMethod_2 {
	public static void main(String[] args) {
		//1. ��ü ����
		A5 a = new A5();
		//2. �޼��� ȣ�� + ���� ó��
		try {
			a.abc();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
