package chap10;

class Animal{
	void cry() {}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("Â±Â±");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("¾ß¿Ë");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("¸Û¸Û");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		
		//¿À¹ö¶óÀÌµù
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		//¹è¿­·Î °ü¸®
		Animal[] animals = {ab, ac, ad};
		for(Animal animal : animals) {
			animal.cry();
		}
	}

}