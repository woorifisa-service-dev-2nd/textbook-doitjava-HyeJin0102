package chap17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	public static void main(String[] args) {
		
		//1.������ �߰� �ð� ��
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		//1-1.ArrayList ������ �߰� �ð�
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++)
			aList.add(0,i);
		endTime = System.nanoTime();
		System.out.println("ArrayList ������ �߰� �ð� = " + (endTime-startTime)+" ns");
		
		//1-2. LinkedList ������ �߰� �ð�
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++)
			linkedList.add(0,i);
		endTime = System.nanoTime();
		System.out.println("LinkedList ������ �߰� �ð� = " + (endTime-startTime)+" ns");
		
		//2-1. ArrayList ������ �˻� �ð�
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++)
			aList.get(i);
		endTime = System.nanoTime();
		System.out.println("ArrayList ������ �˻� �ð� = " + (endTime-startTime)+" ns");
		
		//2-2. LinkedList ������ �˻� �ð�
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++)
			linkedList.get(i);
		endTime = System.nanoTime();
		System.out.println("LinkedList ������ �˻� �ð� = " + (endTime-startTime)+" ns");
		
		//3-1. ArrayList ������ ���� �ð�
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++)
			aList.remove(0);
		endTime = System.nanoTime();
		System.out.println("ArrayList ������ ���� �ð� = " + (endTime-startTime)+" ns");
		
		//3-2 LinkedList ������ ���� �ð�
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++)
			linkedList.remove(0);
		endTime = System.nanoTime();
		System.out.println("LinkedList ������ ���� �ð� = " + (endTime-startTime)+" ns");
	}

}
