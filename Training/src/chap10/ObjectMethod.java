package chap10;

class Hi {
	String name;
	Hi(String name) {
		this.name = name;
	}
}

class Hello {
	String name;
	Hello(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Hello)obj).name) {
			return true;
		} else {
			return false;
		}
	}
}

public class ObjectMethod {
	public static void main(String[] args) {
		Hi a1 = new Hi("¾È³ç");
		Hi a2 = new Hi("¾È³ç");
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		Hello b1 = new Hello("¾È³ç");
		Hello b2 = new Hello("¾È³ç");
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}

}
