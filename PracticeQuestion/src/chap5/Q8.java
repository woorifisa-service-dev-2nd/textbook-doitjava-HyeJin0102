package chap5;

public class Q8 {

	public static void main(String[] args) {
		String str = "�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�";
		String name;
		int age;
		
		name = str.substring(str.indexOf('[')+1, str.indexOf(']'));
		age = Integer.parseInt(str.substring(str.lastIndexOf('[')+1, str.lastIndexOf(']')));
		
		System.out.println(name);
		System.out.println(age);
	}

}
