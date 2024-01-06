//抗力甫 度鞍捞 闷绰单, 构啊 巩力老鳖?
//Exception in thread "main" java.lang.NoSuchMethodError: 'void chap10.A.<init>(int)'
package chap10;

class First{
	First(){
		this(3);
		System.out.println("First 积己磊 1");
	}
	First(int a){
		System.out.println("First 积己磊 2");
	}
}

class Second extends First{
	Second(){
		this(3);
		System.out.println("Second 积己磊 1");
	}
	Second(int a){
		System.out.println("Second 积己磊 2");
	}
}

public class SuperMethod {
	public static void main(String[] args) {
		First fit1 = new First();
		System.out.println();
		First fir2 = new First(3);
		System.out.println();
		
		Second sec1 = new Second();
		System.out.println();
		Second sec2 = new Second(3);
	}

}