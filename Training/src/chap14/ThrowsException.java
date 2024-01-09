package chap14;

class A3 {
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object"); // ClassNotFoundException
			Thread.sleep(1000); // InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			//���� ó�� ����
		}
	}
}

//2. ���ܸ� ȣ�� �޼���� ������ ��
class B3 {
	void abc() {
		try {
			bcd(); //InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			// ���� ó�� ����
		}
	}
	
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object"); //ClassNotFoundException
		Thread.sleep(1000);
	}
}

public class ThrowsException {
	public static void main(String[] args) {
	}

}
