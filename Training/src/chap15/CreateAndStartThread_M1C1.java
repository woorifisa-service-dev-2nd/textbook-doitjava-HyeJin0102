package PracticeQuestion.chap15;

class SMIFileThread extends Thread {

	@Override
	public void run() {
		//�ڸ� ��ȣ �ϳ� ~ �ټ�
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {Thread.sleep(20);} catch(InterruptedException e) {}
		
		//�ڸ� ��ȣ ���
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ���ȣ) " + strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M1C1 {
	public static void main(String[] args) {
		
		//SMIFileThread ��ü ���� �� ����
		Thread smifileThread = new SMIFileThread();
		smifileThread.start();
		
		//���� ������ ��ȣ
		int[] intArray = {1,2,3,4,5};
		
		//���� ������ ��ȣ 1 ~ 5
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(���� ������)" + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}

}
