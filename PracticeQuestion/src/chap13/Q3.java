package chap13;

class A1{
	void print() {
		System.out.println("Ŭ���� A �޼���");
	}
	class B1 {
		void print() {
			System.out.println("Ŭ���� B �޼���");
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
