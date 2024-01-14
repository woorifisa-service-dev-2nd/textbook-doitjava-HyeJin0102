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
		
		//1. Goods�� �̿��� Apple ��ü�� �߰��ϰų� ��������
		Goods3<Apple2> goods1 = new Goods3<>();
		goods1.set(new Apple2());
		Apple2 apple = goods1.get(); //�ٿ�ĳ���� �ʿ� x
		
		//2.Goods�� �̿��� Pencil ��ü�� �߰��ϰų� ��������
		Goods3<Pencil2> goods2 = new Goods3<>();
		goods2.set(new Pencil2());
		Pencil2 pencil = goods2.get();
		
		//3.�߸��� Ÿ�� ����
		Goods3<Apple2> goods3 = new Goods3<>();
		goods3.set(new Apple2());
		// ���� Ÿ�� üũ�� ���� ���� �߻�. �翬��. Apple�� �޴´ٰ� �ϰ� Pencil�� ���� �ٶ�������
		//Pencil pencil2 = goods3.get()
	}
}
