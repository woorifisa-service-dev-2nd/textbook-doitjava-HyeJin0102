package chap12;

interface ASample {
	static void abc() {
		System.out.println("A �������̽��� ���� �޼��� abc()");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		
		ASample.abc(); //������ ���� ����
	}

}
