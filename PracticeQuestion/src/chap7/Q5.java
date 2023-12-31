//따로 오류 없는데 출력이 왜 안되는지 모르겠음 : 16번 줄에 static 추가하니 출력됨. static이 뭐길래 없으면 출력이 안되는걸까?
//static은 객체 생성 없이 사용할 수 있게 해줌. (Q5.main())으로 실행 가능해짐. 단, 내가 작성한 코드는 따로 main 메소드를 생성해주는 코드가 없어서 실행 안된것.
package chap7;

class A{
	void averageScore(int...values){
		double sum=0; //해당 코드를 메서드 밖으로 빼서 실행하면 1.0, 2.0, 3.3333333333333335, 5.0이 나옴. double sum로만 둬도 오류 x. 
		//메서드 안으로 들어올 경우 초깃값을 설정해주지 않으면 오류 발생. 초깃값이 없는 null에다가 숫자를 더하려 해서 오류가 발생한걸까?
		//메서드 안에 있는 건 지역변수로 stack에 저장되는데, 그럼 0.0으로 초기화 되는거 아닌가?
		for(int k : values) {
			sum += k;
		}
		System.out.println(sum / values.length);
	}
}

public class Q5{
	public static void main(String[] args) {
		A a = new A();
		
		a.averageScore(1);
		a.averageScore(1,2);
		a.averageScore(1,2,3);
		a.averageScore(1,2,3,4);	
	}
}