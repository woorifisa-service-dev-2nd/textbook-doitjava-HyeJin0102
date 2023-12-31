package chap7;

import jave.util.Arrays;

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3};
		printArray(a); //상단에 정의해둔 배열 값 사용
		printArray(new int[] {1,2,3}); //배열값 새롭게 대입
		//printArray({1,2,3});
		//Syntax error, type annotations are illegal here : 배열 생성과 값 대입 분리 불가. 8줄처럼 선언과 초기화 함께 하는 식으로만 사용 가능
		//Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration : 변수 선언자 삽입하고 로컬 변수 선언 완료x시 발생
	}
	
	public static void printArray(int[] a) {
		System.out.println(java.util.Arrays.toString(a));
		
	}
}
