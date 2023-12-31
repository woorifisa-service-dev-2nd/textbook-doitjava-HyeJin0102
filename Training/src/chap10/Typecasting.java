package chap10;

class A{}

class B extends A{}

public class Typecasting {
	public static void main(String[] args) {
		
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		
		if(aa instanceof B) {
			B b = (B)aa;
			System.out.println("aa�� B�� ĳ�����߽��ϴ�.");
		} else {
			System.out.println("aa�� B Ÿ������ ĳ������ �Ұ���!!");
		}
		if(ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab�� B�� ĳ�����߽��ϴ�.");
		} else {
			System.out.println("ab�� B Ÿ������ ĳ������ �Ұ���!!");
		}
		if("�ȳ�" instanceof String) { //�ȳ��� String Ÿ�� �����ڷ� �����Ǿ��� ������ Stirng<-�ȳ� �̶� �����ѵ�.
			System.out.println("\"�ȳ�\"�� String Ŭ���� �Դϴ�.");
		}
	}

}
