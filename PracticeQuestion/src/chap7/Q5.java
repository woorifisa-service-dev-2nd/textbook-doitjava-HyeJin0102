//���� ���� ���µ� ����� �� �ȵǴ��� �𸣰��� : 16�� �ٿ� static �߰��ϴ� ��µ�. static�� ���淡 ������ ����� �ȵǴ°ɱ�?
//static�� ��ü ���� ���� ����� �� �ְ� ����. (Q5.main())���� ���� ��������. ��, ���� �ۼ��� �ڵ�� ���� main �޼ҵ带 �������ִ� �ڵ尡 ��� ���� �ȵȰ�.
package chap7;

class A{
	void averageScore(int...values){
		double sum=0; //�ش� �ڵ带 �޼��� ������ ���� �����ϸ� 1.0, 2.0, 3.3333333333333335, 5.0�� ����. double sum�θ� �ֵ� ���� x. 
		//�޼��� ������ ���� ��� �ʱ갪�� ���������� ������ ���� �߻�. �ʱ갪�� ���� null���ٰ� ���ڸ� ���Ϸ� �ؼ� ������ �߻��Ѱɱ�?
		//�޼��� �ȿ� �ִ� �� ���������� stack�� ����Ǵµ�, �׷� 0.0���� �ʱ�ȭ �Ǵ°� �ƴѰ�?
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