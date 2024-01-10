package PracticeQuestion.chap15;

//������ ��ü�� �Ӽ� �ٷ��

public class ThreadProperties {
	public static void main(String[] args) {
		
		//��ü �����ϱ�, �������� ���� ��������
		Thread curThread = Thread.currentThread();
		System.out.println("���� �������� �̸� = " + curThread.getName());
		System.out.println("�����ϴ� ������ ���� = " + Thread.activeCount());
		
		//������ �̸� �ڵ� ����
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		//������ �̸� ���� ����
		for(int i = 0; i <3; i++) {
			Thread thread = new Thread();
			thread.setName(i+"��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
		
		//������ �̸� �ڵ� ����
		for(int i = 0; i<3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		//������ ���� ��������
		System.out.println("�����ϴ� �������� ���� = " + Thread.activeCount());
	}
}
