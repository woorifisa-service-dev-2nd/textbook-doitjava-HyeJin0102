package chap16;

class A3 {}
class B3 extends A3{}
class C3 extends B3{}
class D3 extends C3{}

class Goods4<T> {
	private T t;
	public T get() {
		return t;
	}
}

class Test {
	void methods1(Goods4<A3> g) {} //case 1 : 제네릭 A타입만 저장 가능
	void methods2(Goods4<?> g) {} //case 2 : A,B,C,D 타입 모두 저장 가능
	void methods3(Goods4<? extends B3> g) {} //case 3 : B 또는 B의 하위 클래스만 저장 가능
	void methods4(Goods4<? super B3> g) {} //case 4 : B 또는 B의 상위 클래스만 저장 가능
}

public class BoundedTypeOfInputArguments {
	public static void main(String[] args) {
		Test t = new Test();
		
		//case 1
		t.methods1(new Goods4<A3>());
//		t.methods1(new Goods4<B3>()); //The method methods1(Goods<A3>) in the type Test is not applicable for the arguments (Goods<B3>)
//		t.methods1(new Goods4<C3>()); //The method methods1(Goods<A3>) in the type Test is not applicable for the arguments (Goods<C3>)
//		t.methods1(new Goods4<D3>()); //The method methods1(Goods<A3>) in the type Test is not applicable for the arguments (Goods<D3>)
		
		//case 2
		t.methods2(new Goods4<A3>());
		t.methods2(new Goods4<B3>());
		t.methods2(new Goods4<C3>());
		t.methods2(new Goods4<D3>());
		
		//case 3
//		t.methods3(new Goods4<A3>()); //The method methods3(Goods<? extends B3>) in the type Test is not applicable for the arguments (Goods<A3>)
		t.methods3(new Goods4<B3>());
		t.methods3(new Goods4<C3>());
		t.methods3(new Goods4<D3>());
		
		//case 4
		t.methods4(new Goods4<A3>());
		t.methods4(new Goods4<B3>());
//		t.methods4(new Goods4<C3>()); //The method methods4(Goods<? super B3>) in the type Test is not applicable for the arguments (Goods<C3>)
//		t.methods4(new Goods4<D3>()); //The method methods4(Goods<? super B3>) in the type Test is not applicable for the arguments (Goods<D3>)
	}

}
