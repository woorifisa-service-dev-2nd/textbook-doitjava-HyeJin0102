package practice.chap12;

interface First{
	int a = 3;
	void abc();
}

class One implements First {
	public void abc() {
		System.out.println("��� 1. �ڽ� Ŭ���� �����ڷ� ��ü ����");
	}
}

public class CreateObjectOfInterface1 {
	public static void main(String[] args) {		
		First b1 = new One();
		First b2 = new One();
		
		b1.abc();
		b2.abc();
	}

}
