package chap16;

class A {
	public <T> void method(T t) {
		//System.out.println(t.length); //length cannot be resolved or is not a field
		System.out.println(t.equals("�ȳ�")); // ���׸� �޼��� ������ object �޼��常 ȣ�� ����
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");
	}
}
