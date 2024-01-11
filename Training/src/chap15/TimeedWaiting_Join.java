package chap15;

class MyThread6 extends Thread {

	@Override
	public void run() {
		for(long i = 0; i < 1000000000L; i++) {} //시간 지연
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
			System.out.println("--- join(...) 진행 중 interrupt() 발생");
			for(long i = 0; i < 100000000L; i++) {} //시간 지연
		}
	}
}

public class TimeedWaiting_Join {
	public static void main(String[] args) {
		//객체 생성
		MyThread6 myThread1 = new MyThread6();
		MyThread7 myThread2 = new MyThread7(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {} //쓰레드 시작 준비 시간
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
		//TIMED_WAITING
		myThread2.interrupt(); // TIMED_WAITING을 RUNNABLE 상태로 전환
		try {Thread.sleep(1000);} catch (InterruptedException e) {} //쓰레드 시작 준비 시간
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
	}

}
