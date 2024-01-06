package chap12;

abstract class A1 {
	abstract void abc();
}

public class AbstractClass2 {
	public static void main(String[] args) {
		A1 a1 = new A1 () {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		A1 a2 = new A1() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		a1.abc();
		a2.abc();
	}

}
