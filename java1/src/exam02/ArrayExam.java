package exam02;

public class ArrayExam {
	
	public static void main(String[] args) {
		
		int[] arrNum = new int[20];
		
		for(int i=0; i<arrNum.length; i++) {
			arrNum[i] = i;
		}
		for(int i=0; i<arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
		System.out.println(arrNum.length);
	}

}
