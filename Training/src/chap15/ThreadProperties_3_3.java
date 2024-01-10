package chap15;

class MyThread3 extends Thread {

	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon()? "���� ������" : "�Ϲ� ������"));
		for(int i = 0; i<6; i++) {
			System.out.println(getName() + " : " + i + "��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_3 {
	public static void main(String[] args) {
		
		//�Ϲ� ������
		Thread thread1 = new MyThread3();
		thread1.setDaemon(false); //�Ϲ� ������� ����
		thread1.setName("thread1");
		thread1.start();
		
		//���� ������_��� �Ϲ� �����尡 �����Ǿ�� �����
		Thread thread2 = new MyThread3();		
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		//3.5�� �� main ������ ����
		try{Thread.sleep(3500);} catch(InterruptedException e) {}
		System.out.println("main Thread ����");
	}

}
