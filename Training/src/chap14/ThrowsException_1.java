package chap14;

//1.���� �޼��忡 ���� ���� ó��
class A2 {
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
			Thread.sleep(1000); //�Ϲ� ���� : InterruptedException
		} catch (InterruptedException e) {
			//���� ó�� ����
		}
	}
}

//2. ���ܸ� ȣ�� �޼���� ������ ��
class B2 {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			//���� ó�� ����
		}
	}
	void bcd() throws InterruptedException {
		Thread.sleep(1000); //�Ϲ� ���� : InterruptedException
	}
}


public class ThrowsException_1 {
	public static void main(String[] args) {
	}
}
