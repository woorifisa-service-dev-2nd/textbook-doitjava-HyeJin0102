package chap12;

interface A_1 {}
interface B_1 {}

class C implements A_1{
	
}

class D implements A_1, B_1 {
	
}

class E extends C implements A_1, B_1 {
	
}

public class InheritanceOfInterface {
	public static void main(String[] args) {
	}
}
