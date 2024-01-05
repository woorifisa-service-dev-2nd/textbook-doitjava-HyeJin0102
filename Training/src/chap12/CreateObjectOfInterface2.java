package practice.chap12;

interface Interface1 {
	int a = 3;
	void abc();
}

public class CreateObjectOfInterface2 {
	public static void main(String[] args) {
		Interface1 a1 = new Interface1() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		Interface1 a2 = new Interface1() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		a1.abc();
		a2.abc();
	}
}
