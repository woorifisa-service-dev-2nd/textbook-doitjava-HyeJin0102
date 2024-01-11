package chap15;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		
		//������ ���� ���� Ŭ����
		Thread.State state;
		
		//1.��ü ����(NEW)
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i<1000000000L; i++) {} //�ð� ����
			}
		};
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		//2.myThread ����
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		//3.myThread ����
		try {
			myThread.join(); //myThread ������ �Ϸ�� ������  main ������ �Ͻ� ����
		} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state = " + state);
	}
}