package exam04;

public class ClassExam {
	
	int num;
	String str;
	
	ClassExam() {
		System.out.println("�⺻ ������ ȣ��");
	}
	
	ClassExam(String str) {
		System.out.println("��Ʈ�� �Ķ�X ������ ȣ��");
	}
	
	ClassExam(int str) {
		System.out.println("��Ʈ �Ķ�X ������ ȣ��");
	}
	
	ClassExam(boolean str) {
		System.out.println("�ο� �Ķ�X ������ ȣ��");
	}
	
	public void printStr(String str) {
		System.out.println(str);
	}
	
	public String getStr() {
		String str = "asdf";
		return str;
	}
	
	public int getNumber() {
		return 3;
	}
	
	public static void main(String[] args) {
		ClassExam ce = new ClassExam();
		ce.printStr("hou");
		
		String str2 = ce.getStr();
		System.out.println(str2);
		
		int num = ce.getNumber();
		System.out.println(num);
	}

}
