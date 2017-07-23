package exam04;

public class Modifier {

	public int pubNum;		// 어디에서도 접근가능
	private int priNum;		// 이 클래스 안에서만 접근가능.
	int defNum;				// 같은 패키지 안에서 접근가능.
	protected int proNum;	// 같은 패키지 안에서 가능, 다른 패키지라 하더라도 상속받은 클래스는 접근가능.
	
}
