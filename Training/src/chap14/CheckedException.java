//해당 코드들은 오류처리 해주지 않아서 실행되지 않는 일반 예외들

package chap14;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class A implements Cloneable {
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CheckedException {
	public static void main(String[] args) {
		//Checked Exception (일반 예외)
		
		//1. InterruptedException
//		Thread.sleep(1000);
		
		//2. ClassNotFoundException
//		Class cls = Class.forName("java.lang.Object");
		
		//3. IOException
		InputStreamReader in = new InputStreamReader(System.in);
//		in.read();
		
		//4.FileNotFoundException
//		FileInputStream fis = new FileInputStream("text.txt");
		
		//5.CloneNotSuppetedException
		A a1 = new A();
//		A a2 = (A)a1.clone();
	}

}
