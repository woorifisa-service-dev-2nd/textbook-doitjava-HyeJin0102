package practice.chap12;

interface ExamA {
	default void abc() {
		System.out.println("A �������̽��� bcd()");
	}
}

class ExamB implements ExamA {
	public void abc() {
		ExamA.super.abc();
		System.out.println("B Ŭ������ abc()");
	}
}

public class DefaultMethod2 {
	public static void main( String[] args) {
		ExamB b = new ExamB();
		
		b.abc();
	}

}
