package Training.chap16;

//Apple Ŭ������ Apple Ŭ������ ���� �� �ִ� Goods1 Ŭ����
class Apple{}
class Goods1{
	private Apple apple = new Apple();
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

//Pencil Ŭ������ Pencil Ŭ������ ���� �� �ִ� Goods2 Ŭ����
class Pencil{}
class Goods2 {
	private Pencil pencil = new Pencil();
	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		//Goods1�� �̿��� Apple ��ü�� �߰��ϰų� ��������
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple()); //Apple Ÿ�Ը� �Է� ����
		Apple apple = goods1.getApple(); //Apple Ÿ�� ����
		
		//Goods2�� �̿��� Pencil ��ü�� �߰��ϰų� ��������
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil()); //Pencil Ÿ�Ը� �Է� ����
		Pencil pencil = goods2.getPencil(); //Pencil Ÿ�� ����
	}
}
