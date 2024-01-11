package chap15;

class MyThread5 extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("--- sleep() ���� �� interrup() �߻�");
			for(long i=0; i<1000000000L; i++) {} //�ð� ����
		}
	}
}

public class TimeedWaiting_Sleep {
	public static void main(String[] args) {
		MyThread5 myThread = new MyThread5();
		myThread.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		System.out.println("My Thread State = " + myThread.getState());
		
		//TIMED_WAITING
		myThread.interrupt(); //TIMED_WAITING�� RUNNABLE ���·� ��ȯ
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		System.out.println("MyThread State = " + myThread.getState());
	}
}
