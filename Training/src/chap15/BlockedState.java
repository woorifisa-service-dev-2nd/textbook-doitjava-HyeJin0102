package chap15;

class MyBlockTest {
	
	//���� ��ü
	MyClass mc = new MyClass();
	
	//3���� ������ �ʵ� ����
	Thread t1 = new Thread("Thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t2 = new Thread("Thread2") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t3 = new Thread("Thread3") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	void startAll() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	class MyClass {
		synchronized void syncMethod() {
			try {Thread.sleep(1000);} catch(InterruptedException e) {} //������ ���� �غ� �ð�
			System.out.println("====" + Thread.currentThread().getName() + " ====");
			System.out.println("thread1 -> " + t1.getState());
			System.out.println("thread2 -> " + t2.getState());
			System.out.println("thread3 -> " + t3.getState());
			for(long i = 0; i < 1000000000L; i++) {} //�����ð�
		}
	}
}

public class BlockedState {
	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest();
		mbt.startAll();
	}

}
