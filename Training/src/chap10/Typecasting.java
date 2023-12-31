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
			System.out.println("aa를 B로 캐스팅했습니다.");
		} else {
			System.out.println("aa는 B 타입으로 캐스팅이 불가능!!");
		}
		if(ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab를 B로 캐스팅했습니다.");
		} else {
			System.out.println("ab는 B 타입으로 캐스팅이 불가능!!");
		}
		if("안녕" instanceof String) { //안녕은 String 타입 생성자로 생성되었기 때문에 Stirng<-안녕 이라서 가능한듯.
			System.out.println("\"안녕\"은 String 클래스 입니다.");
		}
	}

}
