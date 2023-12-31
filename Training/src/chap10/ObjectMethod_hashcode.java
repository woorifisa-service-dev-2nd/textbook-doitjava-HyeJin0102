package chap10;

import java.util.HashMap;

class HashA{
	String name;
	HashA(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((HashA)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name;
	}
}

class HashB{
	String name;
	HashB(String name){
		this.name = name;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((HashB)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name;
	}
}

public class ObjectMethod_hashcode {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1);

		HashMap<HashA, String> hm2 = new HashMap<>();
		hm2.put(new HashA("첫번째"), "데이터1");
		hm2.put(new HashA("첫번째"), "데이터2");
		hm2.put(new HashA("두번째"), "데이터3");
		System.out.println(hm2);
		
		HashMap<HashB, String> hm3 = new HashMap<>();
		hm3.put(new HashB("첫번째"), "데이터1");
		hm3.put(new HashB("첫번째"), "데이터2");
		hm3.put(new HashB("두번째"), "데이터3");
		System.out.println(hm3);
	}
}
