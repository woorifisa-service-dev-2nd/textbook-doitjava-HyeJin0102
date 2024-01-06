package chap13;

class A1 {
	C1 c = new C1() { //C타입 생성자 호출 후 중괄호 안에 인터페이스 포함된 추상 메서드 bcd() 구현해 표현함. 인터페이스 C를 상속받은 객체 생성해 참조변수에 대입함
		public void bcd() {
			System.out.println("익명 이너 클래스");			
		}
	};
	void abc() {
		c.bcd();
	}
}	

interface C1 {
	public abstract void bcd();
}


public class AnonymousClass {
	public static void main(String[] args) {
		A1 a = new A1();
		a.abc();
	}
}
