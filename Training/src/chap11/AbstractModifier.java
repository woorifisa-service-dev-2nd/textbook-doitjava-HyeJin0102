package chap11;

abstract class Animal { //Ãß»ó Å¬·¡½º
	abstract void cry(); //Ãß»ó ¸Þ¼­µå
}

class Cat extends Animal {
	void cry() {
		System.out.println("¾ß¿Ë");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("¸Û¸Û");
	}
}

public class AbstractModifier {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
	}

}
