package chap16;

class Parent1{
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent1{}


public class InheritanceGenericMethod {
	public static void main(String[] args) {
		
		//�θ� Ŭ�������� ���׸� �޼��� �̿�
		Parent1 p = new Parent1();
		p.<Integer>print(10);
		p.print(10);
		
		//�ڽ� Ŭ�������� ���׸� �޼��� �̿�
		Child c = new Child();
		c.<Double>print(5.8);
		c.print(5.8);
	}
}