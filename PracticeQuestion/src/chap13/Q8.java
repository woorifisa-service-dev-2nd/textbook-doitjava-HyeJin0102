package chap13;

class A4 {
	interface B4{
		static void bcd() {
			System.out.println("이너 인터페이스 내 static 메서드");
		}
	}
}

public class Q8 {
	public static void main(String[] args) {
		//이너 인터페이스의 static 메서드 호출
		A4.B4.bcd();
	}
}
