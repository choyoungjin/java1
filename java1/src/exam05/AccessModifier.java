package exam05;

import exam04.Modifier;

public class AccessModifier extends Modifier {

	public static void main(String[] args) {
		AccessModifier e = new AccessModifier();
		e.pubNum = 3;
//		e.priNum = 3;
//		e.defNum = 3;	상속 받았지만 패키지가 달라서 에러.
		e.proNum = 3;
	}
}
