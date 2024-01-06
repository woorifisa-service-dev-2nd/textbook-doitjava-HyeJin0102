package chap13;

class A1{
	void print() {
		System.out.println("클래스 A 메서드");
	}
	class B1 {
		void print() {
			System.out.println("클래스 B 메서드");
		}
		void bcd() {
			A1.this.print();
			};
		}
	}
public class Q3 {
	public static void main(String[] args) {
		A1 a = new A1();
		A1.B1 ab = a.new B1();
		ab.bcd();
	}

}
