package chap14;

class A3 {
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object"); // ClassNotFoundException
			Thread.sleep(1000); // InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			//예외 처리 구문
		}
	}
}

//2. 예외를 호출 메서드로 전가할 때
class B3 {
	void abc() {
		try {
			bcd(); //InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			// 예외 처리 구문
		}
	}
	
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object"); //ClassNotFoundException
		Thread.sleep(1000);
	}
}

public class ThrowsException {
	public static void main(String[] args) {
	}

}
