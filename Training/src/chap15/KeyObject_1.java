package chap15;

class MyData3 {
	synchronized void abc() { //this ��ü�� ���� �ִ� �ϳ��� ���踦 �Բ� ���
		for(int i = 0; i<3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
	
	synchronized void bcd() { //this ��ü�� ���� �ִ� �ϳ��� ���踦 �Բ� ���
		for(int i = 0; i<3; i++) {
			System.out.println(i + "��");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
			}
		}
	
	void cde() {
		synchronized(this) { //this ��ü�� ���� �ִ� �ϳ��� ���踦 �Բ� ���
			for(int i = 0; i<3; i++) {
				System.out.println(i + "��°");
				try {Thread.sleep(1000);} catch(InterruptedException e) {}
			}
		}
	}
}

public class KeyObject_1 {
	public static void main(String[] args) {
		//���� ��ü
		MyData3 myData = new MyData3();
		//3���� �����尡 ������ �ż��� ȣ��
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();
	}
}
