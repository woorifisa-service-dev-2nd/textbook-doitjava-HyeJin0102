package chap13;

class A3 {
	interface B3 {
		void abc();
	}
}

public class Q7 {
	public static void main(String[] args) {
		A3.B3 ab = new A3.B3() {
			@Override
			public void abc(){}			
		};
		ab.abc();
	}
}
