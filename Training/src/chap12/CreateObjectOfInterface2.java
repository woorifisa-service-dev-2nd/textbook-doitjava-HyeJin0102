package practice.chap12;

interface Interface1 {
	int a = 3;
	void abc();
}

public class CreateObjectOfInterface2 {
	public static void main(String[] args) {
		Interface1 a1 = new Interface1() {
			public void abc() {
				System.out.println("��� 2. �͸� �̳� Ŭ������ �̿��� ��ü ����");
			}
		};
		Interface1 a2 = new Interface1() {
			public void abc() {
				System.out.println("��� 2. �͸� �̳� Ŭ������ �̿��� ��ü ����");
			}
		};
		
		a1.abc();
		a2.abc();
	}
}
