package chap13;

class A2 {
	static class B2 {
		void bcd() {
			System.out.println("정적 이너 클래스의 메서드");
		}
	}
}

public class Q4 {
	public static void main(String[] args) {
		//정적 이너 클래스 B의 객체 생성(참조 변수명 ab)
		A2.B2 ab = new A2.B2();
		ab.bcd();
	}

}
