package chap12;

interface Exam {
	void abc();
	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	}
}

class Bexam implements Exam {
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}

class Cexam implements Exam {
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() {
		System.out.println("C 클래스의 bcd()");
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		Exam a1 = new Bexam();
		Exam a2 = new Cexam();
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
	}

}
