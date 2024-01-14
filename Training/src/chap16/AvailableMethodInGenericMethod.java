package chap16;

class A {
	public <T> void method(T t) {
		//System.out.println(t.length); //length cannot be resolved or is not a field
		System.out.println(t.equals("안녕")); // 제네릭 메서드 생성시 object 메서드만 호출 가능
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");
	}
}
