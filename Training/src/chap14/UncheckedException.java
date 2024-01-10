package chap14;

class A6 {}

class B extends A6{}

public class UncheckedException {
	public static void main(String[] args) {
		
		//1.ArithmeticException
		System.out.println(3/0);
		
		//2.ClassCastException
		A6 a = new A6();
		B b = (B)a;
		
		//3.ArrayIndexOutOfBoundsException
		int[] array = {1,2,3};
		System.out.println(array[3]);
		
		//4.NumberFormatException
		int num = Integer.parseInt("10!");
		
		
		//5.NullPointerException
		String str = null;
		System.out.println(str.charAt(2));
	}

}
