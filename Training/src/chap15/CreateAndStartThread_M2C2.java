package chap15;

class SMIFileRunnable2 implements Runnable {

	@Override
	public void run() {
		//자막 번호 하나 ~ 다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(30);} catch(InterruptedException e) {}
		
		//자막 번호 출력
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막번호) " + strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

class VideoFileRunnable2 implements Runnable {

	@Override
	public void run() {
		//비디오 프레임 번호
		int[] intArray = {1,2,3,4,5};
				
		//비디오 프레임 번호 1 ~ 5
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임)" + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
	
}

public class CreateAndStartThread_M2C2 {
	public static void main(String[] args) {
		
		//SMIFileRunnable 객체 생성 및 시작
		Runnable smifileRunnable = new SMIFileRunnable2();
		//smiFileRunnable.start(); //Runnable 객체에는 start() 메서드가 없어 오류 발생
		Thread thread1 = new Thread(smifileRunnable);
		thread1.start();
	
		//SMIFileRunnable 객체 생성 및 시작
		Runnable videofileRunnable = new VideoFileRunnable2();
		//videofileRunnable.start(); //Runnable 객체에는 start() 메서드가 없어 오류 발생
		Thread thread2 = new Thread(videofileRunnable);
		thread2.start();
	}
}
