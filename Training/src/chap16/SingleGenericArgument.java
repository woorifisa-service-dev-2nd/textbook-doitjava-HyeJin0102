package chap16;

class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>(); //String 타입 저장하거나 꺼내올 수 있는 객체로 지정
		mc1.set("안녕");
		System.out.println(mc1.get());
		MyClass<Integer> mc2 = new MyClass<>(); // Integer 타입을 저장하거나 꺼내올 수 있는 객체로 지정
		mc2.set(100);
		System.out.println(mc2.get());
		
		//아래 부분은 강한 타입 체크로 오류 발생함. 정수형만 받을 수 있는 mc3에 문자열 넣었으니 당연함
		//MyClass<Integer> mc3 = new MyClass<>();
		//mc3.set("안녕"); 
	}

}
