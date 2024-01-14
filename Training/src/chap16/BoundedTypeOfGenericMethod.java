package chap16;

class A2 {
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}

interface MyInterface{
	public abstract void print();
}

class B2 {
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A2 a = new A2();
		a.method1(5.8); // = a.<Double>method1(5.8);
		
		B2 b = new B2();
		b.method1(new MyInterface() {
			@Override
			public void print() {
				System.out.println("print() ±¸Çö");
			}
		});
	}
}
