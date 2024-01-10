package PracticeQuestion.chap15;

class SMIFileThread extends Thread {

	@Override
	public void run() {
		//자막 번호 하나 ~ 다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(20);} catch(InterruptedException e) {}
		
		//자막 번호 출력
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막번호) " + strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M1C1 {
	public static void main(String[] args) {
		
		//SMIFileThread 객체 생성 및 시작
		Thread smifileThread = new SMIFileThread();
		smifileThread.start();
		
		//비디오 프레임 번호
		int[] intArray = {1,2,3,4,5};
		
		//비디오 프레임 번호 1 ~ 5
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임)" + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}

}
