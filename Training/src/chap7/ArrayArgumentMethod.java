package chap7;

import jave.util.Arrays;

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3};
		printArray(a); //��ܿ� �����ص� �迭 �� ���
		printArray(new int[] {1,2,3}); //�迭�� ���Ӱ� ����
		//printArray({1,2,3});
		//Syntax error, type annotations are illegal here : �迭 ������ �� ���� �и� �Ұ�. 8��ó�� ����� �ʱ�ȭ �Բ� �ϴ� �����θ� ��� ����
		//Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration : ���� ������ �����ϰ� ���� ���� ���� �Ϸ�x�� �߻�
	}
	
	public static void printArray(int[] a) {
		System.out.println(java.util.Arrays.toString(a));
		
	}
}
