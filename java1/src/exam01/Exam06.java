package exam01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���̵� �Է����ּ���=>");
		String id = s.nextLine();
		System.out.println("��й�ȣ�� �Է����ּ���=>");
		System.out.println("�ܺ�й�ȣ�� ���ڸ� �Է����ּž� �մϴ�");

		String pwd = s.nextLine();
		int pwdNum=0;
		
		try {
			pwdNum = Integer.parseInt(pwd);
		} catch(Exception e) {
			System.out.println("���ڷ� �Է��϶󱸿�!");
		}
		
		System.out.println("���̵� :"+id);
		System.out.println("��й�ȣ :"+pwd);
		System.out.println("���ں�й�ȣ :"+pwdNum);
	}
}
