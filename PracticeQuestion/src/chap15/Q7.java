package chap15;

class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("첫 번째 출력");
			Thread.sleep(1000);
			System.out.println("두 번째 출력");
			Thread.sleep(1000);
			System.out.println("세 번째 출력");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("쓰레드 종료");
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

//실행 결과가 왜 이렇게 나올까? try문은 중간에 끊기면 오류를 뱉나?
//첫 번째 출력
//두 번째 출력
//쓰레드 종료
