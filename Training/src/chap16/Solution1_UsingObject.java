package chap16;

//Apple Ŭ������ Pencil Ŭ������ ��� �����ϰų� ���� �� �ִ� Ŭ����
class Apple1{}
class Pencil1{}

class Goods {
	private Object object = new Object();
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class Solution1_UsingObject {
	public static void main(String[] args) {
		//Goods�� �̿��� Apple ��ü�� �߰��ϰų� ��������
		Goods goods1 = new Goods();
		goods1.setObject(new Apple()); 
		Apple apple = (Apple)goods1.getObject();
		
		//Goods�� �̿��� Pencil ��ü�� �߰��ϰų� ��������
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil()); 
		Pencil pencil = (Pencil) goods2.getObject(); 
	}
}