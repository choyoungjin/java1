package exam01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("반복문의 시작값을 입력하시오");
		String initStr = scan.nextLine();
		int initNum = Integer.parseInt(initStr);

		System.out.println("반복문의 끝값을 입력하시오");
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
