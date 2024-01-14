package chap16;

class A1 {}
class B extends A1 {}
class C extends B {}
class D <T extends B> { //B�� C�� �� �� �ִ� class D
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
//		D<A> d1 = new D<>(); //A�� B���� ���� Ŭ�����̱� ������ �Ұ�
		//Bound mismatch: The type A is not a valid substitute for the bounded parameter <T extends B> of the type D<T>
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D(); //D<B> d4 = new D<>();
		
		d2.set(new B());
		d2.set(new C());
		
//		d3.set(new B()); //The method set(C) in the type D<C> is not applicable for the arguments (B)
		// d3 ��ü�� ��ü�� ������ �� ���׸� Ÿ������ C�� �����ϹǷ� B��ü�� �Է� �Ұ���
		d3.set(new C());
		
		d4.set(new B());
		d4.set(new C());
	}

}
