package practice.chap12;

abstract class A{
	abstract void abc(); 
}

class B extends A {
	void abc() {
		System.out.println("��� 1. �ڽ� Ŭ���� ���� �� �߻� �޼��� ����");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		A b1 = new B();
		A b2 = new B();
		
		b1.abc();
		b2.abc();
	}

}
