package chap15;

class MyData3 {
	synchronized void abc() { //this 객체가 갖고 있는 하나의 열쇠를 함께 사용
		for(int i = 0; i<3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
	
	synchronized void bcd() { //this 객체가 갖고 있는 하나의 열쇠를 함께 사용
		for(int i = 0; i<3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
			}
		}
	
	void cde() {
		synchronized(this) { //this 객체가 갖고 있는 하나의 열쇠를 함께 사용
			for(int i = 0; i<3; i++) {
				System.out.println(i + "번째");
				try {Thread.sleep(1000);} catch(InterruptedException e) {}
			}
		}
	}
}

public class KeyObject_1 {
	public static void main(String[] args) {
		//공유 객체
		MyData3 myData = new MyData3();
		//3개의 쓰레드가 각각의 매서드 호출
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
