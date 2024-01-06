package chap13;

interface A3 {
	public abstract void abc();
}

class C3 {
	void cde(A3 a) {
		a.abc(); 
	}
}

public class AnonymousClass_3 {
	public static void main(String[] args) {
		C3 c = new C3(); //방법 3. 클래스명X + 참조 변수명O
		A3 a = new A3() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		};
		c.cde(a); 
		c.cde(new A3() { //방법4. 클래스명X + 참조 변수명X
			public void abc() {
				System.out.println("입력 매개변수 전달");
			}
		});
	}

}
