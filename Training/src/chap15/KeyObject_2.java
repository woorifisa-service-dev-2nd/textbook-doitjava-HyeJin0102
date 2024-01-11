package chap15;

class MyData4 {
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
		synchronized(new Object()) { //object�� ���� �ִ� ���踦 ���
			for(int i = 0; i<3; i++) {
				System.out.println(i + "��°");
				try {Thread.sleep(1000);} catch(InterruptedException e) {}
			}
		}
	}
}

public class KeyObject_2 {
	public static void main(String[] args) {
		//���� ��ü
		MyData4 myData = new MyData4();
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
