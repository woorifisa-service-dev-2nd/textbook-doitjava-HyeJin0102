package chap12;

interface ASample {
	static void abc() {
		System.out.println("A 인터페이스의 정적 메서드 abc()");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		
		ASample.abc(); //생성자 없이 실행
	}

}
