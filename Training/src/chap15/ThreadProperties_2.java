package chap15;

class MyThread extends Thread {

	@Override
	public void run() {
		for(long i = 0; i<1000000000; i++) {} //�ð� ������ �ڵ�
		System.out.println(getName() + "�켱���� : "+getPriority());
	}
}

public class ThreadProperties_2 {
	public static void main(String[] args) {
		//CPU�ھ� ��
		System.out.println("�ھ� �� : " + Runtime.getRuntime().availableProcessors());
		
		//�켱 ���� �ڵ� ����
		for(int i = 0; i<3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		//�켱 ���� ���� ����
		for(int i = 0; i<10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "��° ������");
			if(i==9) thread.setPriority(10);
			thread.start();
		}
	}

}
