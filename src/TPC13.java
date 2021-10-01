import kr.tpc.Inflearn;

public class TPC13 {
	public static void main(String[] args) {
		
		// Inflearn inf = new Inflearn(); // 객체 생성, 기본 생성자 메서드는 public이기 때문에 객체가 생성된다.
		// inf.tpc();
		// inf.java();
		Inflearn.java(); // 클래스 메서드는 객체 생성 과정 없이 이렇게 바로 쓸 수 있다. (인스턴스 메서드와 다르게 클래스 메서드는 글자가 살짝 기울어져 있다.)

		// Java API 생성자 private
		
		// System sys = new System();
		System.out.println("출력"); // 자주 쓰는 메서드는 private 생성자를 이용하여 간편하게 사용할 수 있다.
		
		//Math m = new Math();
		int v = Math.max(10, 20);
		System.out.println(v);
	}
}
