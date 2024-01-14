package chap16;

class A1 {}
class B extends A1 {}
class C extends B {}
class D <T extends B> { //B와 C만 올 수 있는 class D
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class BoundedTypeOfGenericClass {
	public static void main(String[] args) {
//		D<A> d1 = new D<>(); //A는 B보다 상위 클래스이기 때문에 불가
		//Bound mismatch: The type A is not a valid substitute for the bounded parameter <T extends B> of the type D<T>
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D(); //D<B> d4 = new D<>();
		
		d2.set(new B());
		d2.set(new C());
		
//		d3.set(new B()); //The method set(C) in the type D<C> is not applicable for the arguments (B)
		// d3 객체는 객체를 생성할 때 제네릭 타입으로 C를 지정하므로 B객체는 입력 불간으
		d3.set(new C());
		
		d4.set(new B());
		d4.set(new C());
	}

}
