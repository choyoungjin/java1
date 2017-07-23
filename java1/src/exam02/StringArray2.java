package exam02;

public class StringArray2 {
	int num;
	public void printStr() {
		System.out.println("printStr을 호출하셨네요");
	}
	
	public static void main(String[] args) {
	
		StringArray2 st2 = new StringArray2();
		st2.printStr();
		st2.num=3;
		System.out.println(st2.num);
	}

}
