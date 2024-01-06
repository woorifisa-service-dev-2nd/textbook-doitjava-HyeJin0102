package chap13;

class A {
	int a = 3;
	void abc() {
		int b = 5;
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a=5;
				System.out.println(a);
			}
		}
		B bb = new B();
		bb.bcd();
	}
}
public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		a.abc();
		
		
	}
}
