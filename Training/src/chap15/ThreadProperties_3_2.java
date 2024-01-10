package chap15;

class MyThread2 extends Thread {

	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon()? "데몬 쓰레드" : "일반 쓰레드"));
		for(int i = 0; i< 6; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_2 {
	public static void main(String[] args) {

		//일반 쓰레드
		 Thread thread1 = new MyThread2();
		 thread1.setDaemon(true); //데몬 쓰레드로 작동하여 main 쓰레드 종료시 함께 종료
		 thread1.setName("thread1");
		 thread1.start();
		 
		 //3.5초 후 main 쓰레드 종료
		 try {Thread.sleep(1000);} catch(InterruptedException e) {}
		 System.out.println("main Thread 종료");
	}
}
