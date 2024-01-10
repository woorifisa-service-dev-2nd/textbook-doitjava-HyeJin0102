package chap15;

class SMIFileRunnable2 implements Runnable {

	@Override
	public void run() {
		//�ڸ� ��ȣ �ϳ� ~ �ټ�
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {Thread.sleep(30);} catch(InterruptedException e) {}
		
		//�ڸ� ��ȣ ���
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ���ȣ) " + strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

class VideoFileRunnable2 implements Runnable {

	@Override
	public void run() {
		//���� ������ ��ȣ
		int[] intArray = {1,2,3,4,5};
				
		//���� ������ ��ȣ 1 ~ 5
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(���� ������)" + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
	
}

public class CreateAndStartThread_M2C2 {
	public static void main(String[] args) {
		
		//SMIFileRunnable ��ü ���� �� ����
		Runnable smifileRunnable = new SMIFileRunnable2();
		//smiFileRunnable.start(); //Runnable ��ü���� start() �޼��尡 ���� ���� �߻�
		Thread thread1 = new Thread(smifileRunnable);
		thread1.start();
	
		//SMIFileRunnable ��ü ���� �� ����
		Runnable videofileRunnable = new VideoFileRunnable2();
		//videofileRunnable.start(); //Runnable ��ü���� start() �޼��尡 ���� ���� �߻�
		Thread thread2 = new Thread(videofileRunnable);
		thread2.start();
	}
}
