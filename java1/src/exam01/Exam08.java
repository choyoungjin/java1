package exam01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݺ����� ���۰��� �Է��Ͻÿ�");
		String initStr = scan.nextLine();
		int initNum = Integer.parseInt(initStr);

		System.out.println("�ݺ����� ������ �Է��Ͻÿ�");
		String finalStr = scan.nextLine();
		int finalNum = Integer.parseInt(finalStr);

		int num = 0;
		for(int i=initNum; i<=finalNum; i++) {
//			if(i%3==0 && i%2==0) {
//				num += i;
//			}
			System.out.println(i);
		}
		System.out.println(num);
	}
}
