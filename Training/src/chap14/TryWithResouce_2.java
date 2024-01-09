package chap14;

class A1 implements AutoCloseable {
	String resource;
	A1(String resource){
		this.resource = resource;
	}
	@Override
	public void close() throws Exception {
		if(resource != null) {
			resource = null;
			System.out.println("리소스가 해제됐습니다.");
		}
	}
}

public class TryWithResouce_2 {
	public static void main(String[] args) {
		//1.리소스를 사용 안 하고 finally에서 리소스 수동 해제하기
		A1 a1 = null;
		try {
			a1 = new A1("특정 파일");
		} catch (Exception e) {
			System.out.println("예외처리");
		} finally {
			//리소스 수동 해제
			if(a1.resource != null) {
				try {
					a1.close();
				} catch (Exception e) {}
			}
		}
		
		//2.리소스 자동 해제
		try (A1 a2 = new A1("특정파일");) {
		} catch (Exception e) {
			System.out.println("예외처리");
		}
	}

}
