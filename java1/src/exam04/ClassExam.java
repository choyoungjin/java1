package exam04;

public class ClassExam {
	
	int num;
	String str;
	
	ClassExam() {
		System.out.println("기본 생성자 호출");
	}
	
	ClassExam(String str) {
		System.out.println("스트링 파라멭 생성자 호출");
	}
	
	ClassExam(int str) {
		System.out.println("인트 파라멭 생성자 호출");
	}
	
	ClassExam(boolean str) {
		System.out.println("부울 파라멭 생성자 호출");
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
