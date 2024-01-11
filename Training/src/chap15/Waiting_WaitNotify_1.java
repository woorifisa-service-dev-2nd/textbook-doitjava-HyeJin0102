package chap15;

class DataBox {
	int data;
	synchronized void inputData(int data) {
		this.data = data;
		System.out.println("�Է� ������ : " + data);
	}
	
	synchronized void outputData() {
		System.out.println("��� ������ : " + data);
	}
}

public class Waiting_WaitNotify_1 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 1; i<9; i++) {
					dataBox.outputData();
				}
			};
		};
		
		t1.start();
		t2.start();
	}
}
