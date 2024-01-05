package practice.chap12;

interface Ainter{
	public static final int a =3;
	public abstract void abc();
}

interface Binter{
	int b= 3;
	void bcd();
}

public class InterfaceCharacteristics {
	public static void main(String[] args) {
		System.out.println(Ainter.a);
		System.out.println(Binter.b);
	}

}
