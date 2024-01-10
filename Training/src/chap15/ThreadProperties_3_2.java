package chap15;

class MyThread2 extends Thread {

	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon()? "���� ������" : "�Ϲ� ������"));
		for(int i = 0; i< 6; i++) {
			System.out.println(getName() + " : " + i + "��");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_2 {
	public static void main(String[] args) {

		//�Ϲ� ������
		 Thread thread1 = new MyThread2();
		 thread1.setDaemon(true); //���� ������� �۵��Ͽ� main ������ ����� �Բ� ����
		 thread1.setName("thread1");
		 thread1.start();
		 
		 //3.5�� �� main ������ ����
		 try {Thread.sleep(1000);} catch(InterruptedException e) {}
		 System.out.println("main Thread ����");
	}
}
