package exam04;

public class StaticExam {

	public static int num=1;		
	
	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		se.num=3;
		StaticExam.num = 4;
		System.out.println(se.num);
		System.out.println(StaticExam.num);
		
		StaticExam se2 = new StaticExam();
		System.out.println(se2.num);
	}
}
