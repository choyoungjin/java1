package exam03;

public class Son extends Father {

	String house = "신림고시원";
	
	public Son() {		//생성자
		
	}
	public void printHouse() {
		System.out.println(house);	
	}	
	public static void main(String[] args) { 

		Son s = new Son();
		System.out.println(s.money);
		System.out.println(s.car);
		System.out.println(s.house);	
		s.printHouse();
		s.doJob();
		s.who = "나";
		s.doSleep();
	}

}
