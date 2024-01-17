package chap17;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMethod {
	public static void main(String[] args) {
		List<Integer> linkedList1 = new LinkedList<Integer>();
		
		//1.add(E element)
		linkedList1.add(3);
		linkedList1.add(4);
		linkedList1.add(5);
		System.out.println(linkedList1.toString());
		
		//2.add(int index, E element)
		linkedList1.add(1,6);
		System.out.println(linkedList1.toString());
		
		//3.addAll(�� �ٸ� ����Ʈ ��ü)
		List<Integer> linkedList2 = new LinkedList<>();
		linkedList2.add(1);
		linkedList2.add(2);
		linkedList2.addAll(linkedList1);
		System.out.println(linkedList2);
		
		//4.addAll(int index, �� �ٸ� ����Ʈ ��ü)
		List<Integer> linkedList3 = new LinkedList<>();
		linkedList3.add(1);
		linkedList3.add(2);
		linkedList3.addAll(1, linkedList3);
		System.out.println(linkedList3);
		
		//5.set(int index, E element)
		linkedList3.set(1,5);
		linkedList3.set(3,6);
//		vector3.set(4,7); //Index 4 out of bounds for length 4
		System.out.println(linkedList3);
		
		//6.remove(int index)
		linkedList3.remove(1);
		System.out.println(linkedList3);
		
		//7.remove(Object o)
		linkedList3.remove(new Integer(2));
		System.out.println(linkedList3);
		
		//8.clear()
		linkedList3.clear();
		System.out.println(linkedList3);
		
		//9.isEmpty()
		System.out.println(linkedList3.isEmpty());
		
		//10.size()
		System.out.println(linkedList3.size());
		linkedList3.add(1);
		linkedList3.add(2);
		linkedList3.add(3);
		System.out.println(linkedList3);
		System.out.println(linkedList3.size());
		
		//11.get(int index)
		System.out.println("0��°: " + linkedList3.get(0));
		System.out.println("1��°: " + linkedList3.get(1));
		System.out.println("2��°: " + linkedList3.get(2));
		for(int i = 0; i<linkedList3.size(); i++)
			System.out.println(i + "��°: " + linkedList3.get(i));
		
		//12.toArray() List -> Array
		Object[] object = linkedList3.toArray();
		System.out.println(Arrays.toString(object));
		
		//13-1. toArray(T[] t) -> T[]
		Integer[] integer1 = linkedList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		
		//13-2. toArray(T[] t) -> T[]
		Integer[] integer2 = linkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
	}

}
