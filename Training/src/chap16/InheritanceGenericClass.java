package chap16;

class Parent<T> {
	T t;
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T>{}

class Child2<T, V> extends Parent<T>{
	V v;
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}

public class InheritanceGenericClass {
	public static void main(String[] args) {
		//�θ� ���׸� Ŭ����
		Parent<String> p = new Parent<>();
		p.setT("�θ� ���׸� Ŭ����");
		System.out.println(p.getT());
				
		//�ڽ� Ŭ���� 1
		Child1<String> c1 = new Child1<>();
		c1.setT("�ڽ� 1 ���׸� Ŭ����");
		System.out.println(c1.getT());
		
		//�ڽ� Ŭ���� 2
		Child2<String, Integer> c2 = new Child2<>();
		c2.setT("�ڽ� 2 ���׸� Ŭ����");
		c2.setV(100);
		System.out.println(c2.getT());
		System.out.println(c2.getV());
	}

}
