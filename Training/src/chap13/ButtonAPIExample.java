package chap13;

class Button {
	OnClickListener ocl;
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	interface OnClickListener {
		public abstract void onClick();
	}
	void onClick () {
		ocl.onClick();
	}
}

public class ButtonAPIExample {
	public static void main(String[] args) {
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("������ 1 : ���� ���");
			}
		});
		btn1.onClick();
		
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ 2 : ���̹� ����");
			}
		});
		btn2.onClick();
	}
}
