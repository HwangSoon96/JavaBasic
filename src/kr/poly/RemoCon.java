package kr.poly;
public interface RemoCon { // 추상 클래스와 마찬가지로 단독으로 객체 생성 불가능
	
	// 상수 사용 가능, public static final은 생략 가능
	public static final int MAXCH = 100; // static -> 객체 생성 없이 RemoCon.MAXCH로 사용 가능
	public final static int MINCH = 1; // final -> 상수는 변경 불가
	
	// 추상 메서드
	// 인터페이스는 구현된 메서드를 가질 수 없다. -> 100% 추상 메서드만 가질 수 있다.
	public abstract void chUp(); // 인터페이스는 추상 메서드만 가질 수 있으므로 abstract가 기본적으로 생략되어 있다.
	public void chDown();
	public void internet();

}
