package exam03;

public class ConExam {
	int age = 30;
	String name = "홍길동";
	
	public ConExam(int age, String name) {
		this.age = age;
		this.name = name;
		
		if(age<20) {
			System.out.println("10대입니다");
		}
		else if(age<30) {
			System.out.println("20대입니다");
		}
		else if(age<40) {
			System.out.println("30대입니다");
		}
		else if(age<50) {
			System.out.println("40대입니다");
		}
		else if(age<60) {
			System.out.println("50대입니다");
		}
		else if(age>=60) {
			System.out.println("우대권 받아가세요");
		}
		System.out.println(age);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		ConExam ce = new ConExam(20,"김길동");	
		ConExam ce1 = new ConExam(30,"고길동");

	}
}
