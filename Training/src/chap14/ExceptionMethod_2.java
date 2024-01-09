package chap14;

class A5 {
	void abc() throws NumberFormatException {
		bcd();
	}
	
	void bcd() throws NumberFormatException {
		cde();
	}
	
	void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");
	}
}

public class ExceptionMethod_2 {
	public static void main(String[] args) {
		//1. 객체 생성
		A5 a = new A5();
		//2. 메서드 호출 + 예외 처리
		try {
			a.abc();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
