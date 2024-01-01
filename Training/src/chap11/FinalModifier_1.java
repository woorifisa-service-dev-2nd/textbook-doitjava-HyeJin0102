package chap11;

class A1 {
	int a= 3;
	final int b = 5;
	A1(){
		
	}
	@Override
	public String toString() {
		return "A1 [a=" + a + ", b=" + b + "]";
	}
	
}

class A2{
	int a;
	final int b;
	A2(){
		a = 3;
		b = 5;
	}
	@Override
	public String toString() {
		return "A2 [a=" + a + ", b=" + b + "]";
	}
	
}

class A3{
	int a = 3;
	final int b = 5;
	A3() {
		a = 5;
	}
}

class B{
	void bcd() {
		int a = 3;
		final int b = 5;
		a = 7;
	}
}

public class FinalModifier_1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		A2 a2 = new A2();
		
		a1.a = 7;
		a2.a = 7;
		
		System.out.println(a1);
		System.out.println(a2);
	}
}
