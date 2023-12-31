package chap10;

class One {
	int a = 3;
	int b = 4;
}

class Two {
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "Two [a=" + a + ", b=" + b + "]";
	}

}

public class ObjectMethod_toString {

	public static void main(String[] args) {
		One a = new One();
		Two b = new Two();
		
		System.out.printf("%x\n", a.hashCode());
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
