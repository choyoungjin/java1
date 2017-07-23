package exam01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("니가 생각하는 숫자를 읊어보렴~");
		//String str = scan.nextLine();
		//int str = Integer.parseInt(scan.nextLine());
		int str2 = scan.nextInt();
		System.out.println(str2);

		if(str2>0) {
			if(str2==1) {
				System.out.println("1이구나!");
			}
			else if(str2==2) {
				System.out.println("2구나");
			}
			else if(str2==3) {
				System.out.println("3이구나!");
			}
			else {
				System.out.println("뭔지 모르겠다");
			}
		}
		else {
			System.out.println("음수구나");
		}

	}
}
