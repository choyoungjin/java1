package exam04;

public class FunctionExam2 {

	public void printStr1(Person str) {
		System.out.println("매개변수있는 함수네" + str);
		str.doWork();
	}
	protected void printStr1(int str) {
		System.out.println("인트 매개변수 있는 함수네");
	}
	protected void printStr1() {
		System.out.println("매개변수 없는 함수네");
	}
	public static void main(String[] args) {
		FunctionExam2 fe = new FunctionExam2();

		BizMan bm = new BizMan();
		fe.printStr1(bm);
		
		Person p = new Person();
		fe.printStr1(p);

		Student s = new Student();
		fe.printStr1(s);

		int a = 3;
		fe.printStr1(a);
	}
}
