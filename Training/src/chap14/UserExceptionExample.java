package chap14;

//점수가 음수일때 예외 발생
class MinusException extends Exception {
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

//점수가 100점을 초과할 경우 예외 발생
class OverException extends Exception {
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

class A7 {
	void checkScore(int score) throws MinusException, OverException {
		if(score < 0) {
			throw new MinusException("예외 발생  : 음숫값 입력");
		}
		else if (score > 100)
			throw new OverException("예외 발생 : 100점 초과");
		else
			System.out.println("정상적인 값입니다.");
	}
}

public class UserExceptionExample {
	public static void main(String[] args) {
		A7 a = new A7();
		try {
			a.checkScore(85);
			a.checkScore(150);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
	}

}
