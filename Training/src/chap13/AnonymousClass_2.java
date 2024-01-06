package chap13;

interface A2 {
	public abstract void abc();
}

class B2 implements A2 { //자식 클래스 직접 생성
	public void abc() {
		System.out.println("입력매개변수 전달");
	}
}

class C2 {
	void cde(A2 a) { //매개변수로 자식클래스 생성자로로 생성된 A타입의 a 넘겨줌. (A2의 abc가 B2의 abc로 오버라이딩 되어 있음)
		a.abc(); //해당 매개변수를 사용해 메서드 호출
	}
}

public class AnonymousClass_2 {
	public static void main(String[] args) {
		C2 c = new C2(); //방법 1. 클래스명O + 참조 변수명O
		A2 a = new B2(); //방법2. 클래스명O + 참조변수명X
		c.cde(a); 
		c.cde(new B2());
	}

}
