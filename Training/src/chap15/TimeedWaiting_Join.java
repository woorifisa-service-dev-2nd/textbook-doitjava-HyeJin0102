package chap15;

class MyThread6 extends Thread {

	@Override
	public void run() {
		for(long i = 0; i < 1000000000L; i++) {} //�ð� ����
	}
}

class MyThread7 extends Thread {
	MyThread6 myThread1;
	public MyThread7(MyThread6 myThread1) {
		this.myThread1 = myThread1;
	}
	@Override
	public void run() {
		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			System.out.println("--- join(...) ���� �� interrupt() �߻�");
			for(long i = 0; i < 100000000L; i++) {} //�ð� ����
		}
	}
}

public class TimeedWaiting_Join {
	public static void main(String[] args) {
		//��ü ����
		MyThread6 myThread1 = new MyThread6();
		MyThread7 myThread2 = new MyThread7(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {} //������ ���� �غ� �ð�
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
		//TIMED_WAITING
		myThread2.interrupt(); // TIMED_WAITING�� RUNNABLE ���·� ��ȯ
		try {Thread.sleep(1000);} catch (InterruptedException e) {} //������ ���� �غ� �ð�
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
	}

}
