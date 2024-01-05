package practice.chap12;

interface ExamA {
	default void abc() {
		System.out.println("A 인터페이스의 bcd()");
	}
}

class ExamB implements ExamA {
	public void abc() {
		ExamA.super.abc();
		System.out.println("B 클래스의 abc()");
	}
}

public class DefaultMethod2 {
	public static void main( String[] args) {
		ExamB b = new ExamB();
		
		b.abc();
	}

}
