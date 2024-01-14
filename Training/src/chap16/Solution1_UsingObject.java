package chap16;

//Apple 클래스와 Pencil 클래스를 모두 저장하거나 꺼낼 수 있는 클래스
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
		//Goods를 이용해 Apple 객체를 추가하거나 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple()); 
		Apple apple = (Apple)goods1.getObject();
		
		//Goods를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil()); 
		Pencil pencil = (Pencil) goods2.getObject(); 
	}
}