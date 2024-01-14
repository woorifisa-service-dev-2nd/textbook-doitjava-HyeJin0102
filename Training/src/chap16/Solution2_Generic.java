package chap16;

class Apple2{}
class Pencil2{}
class Goods3<T> {
	
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}

public class Solution2_Generic {
	public static void main(String[] args) {
		
		//1. Goods를 이용해 Apple 객체를 추가하거나 가져오기
		Goods3<Apple2> goods1 = new Goods3<>();
		goods1.set(new Apple2());
		Apple2 apple = goods1.get(); //다운캐스팅 필요 x
		
		//2.Goods를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods3<Pencil2> goods2 = new Goods3<>();
		goods2.set(new Pencil2());
		Pencil2 pencil = goods2.get();
		
		//3.잘못된 타입 선언
		Goods3<Apple2> goods3 = new Goods3<>();
		goods3.set(new Apple2());
		// 강한 타입 체크로 문법 오류 발생. 당연함. Apple만 받는다고 하고 Pencil도 받은 바람둥이임
		//Pencil pencil2 = goods3.get()
	}
}
