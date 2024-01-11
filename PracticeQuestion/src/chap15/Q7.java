package chap15;

class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("ù ��° ���");
			Thread.sleep(1000);
			System.out.println("�� ��° ���");
			Thread.sleep(1000);
			System.out.println("�� ��° ���");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("������ ����");
		}
	}
}

public class Q7 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		mt.interrupt();
	}
}

//���� ����� �� �̷��� ���ñ�? try���� �߰��� ����� ������ ��?
//ù ��° ���
//�� ��° ���
//������ ����
