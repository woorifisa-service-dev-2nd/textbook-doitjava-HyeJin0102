package chap14;

class A1 implements AutoCloseable {
	String resource;
	A1(String resource){
		this.resource = resource;
	}
	@Override
	public void close() throws Exception {
		if(resource != null) {
			resource = null;
			System.out.println("���ҽ��� �����ƽ��ϴ�.");
		}
	}
}

public class TryWithResouce_2 {
	public static void main(String[] args) {
		//1.���ҽ��� ��� �� �ϰ� finally���� ���ҽ� ���� �����ϱ�
		A1 a1 = null;
		try {
			a1 = new A1("Ư�� ����");
		} catch (Exception e) {
			System.out.println("����ó��");
		} finally {
			//���ҽ� ���� ����
			if(a1.resource != null) {
				try {
					a1.close();
				} catch (Exception e) {}
			}
		}
		
		//2.���ҽ� �ڵ� ����
		try (A1 a2 = new A1("Ư������");) {
		} catch (Exception e) {
			System.out.println("����ó��");
		}
	}

}
