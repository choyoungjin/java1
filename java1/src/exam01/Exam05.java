package exam01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�ϰ� �����ϴ� ���ڸ� �����~");
		//String str = scan.nextLine();
		//int str = Integer.parseInt(scan.nextLine());
		int str2 = scan.nextInt();
		System.out.println(str2);

		if(str2>0) {
			if(str2==1) {
				System.out.println("1�̱���!");
			}
			else if(str2==2) {
				System.out.println("2����");
			}
			else if(str2==3) {
				System.out.println("3�̱���!");
			}
			else {
				System.out.println("���� �𸣰ڴ�");
			}
		}
		else {
			System.out.println("��������");
		}

	}
}
