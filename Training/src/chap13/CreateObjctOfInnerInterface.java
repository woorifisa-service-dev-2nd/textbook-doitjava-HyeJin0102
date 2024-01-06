package chap13;

class A4{
	interface B4{ //이너 인터페이스. 앞에 static 생략 되어 있음
		public abstract void bcd();
	}
}

class C4 implements A4.B4 {
	public void bcd() {
		System.out.println("이너 인터페이스 구현 클래스 생성");
	}
}

public class CreateObjctOfInnerInterface {
	public static void main(String[] args) {
//		A4.B4 ab = new C4(); //해당 부분이 없어도 잘 돌아가는데, 이 부분은 왜 있는 걸까?
		C4 c = new C4(); //자식 클래스 직접 생성
		c.bcd();
		A4.B4 b = new A4.B4() { //익명 이너 클래스 생성
			public void bcd() {
				System.out.println("익명 이너 클래스로 객체 생성");
			}
		};
		b.bcd();
	}
}