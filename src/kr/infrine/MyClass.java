package kr.infrine;

public class MyClass { // 패키지 내의 클래스에서 public 또는 private 생략하면 디폴트 접근권한을 가짐 -> 같은 패키지 내의 클래스들만 접근 가능
	
	public int sum(int a, int b) {
		int hap = 0;
		for(int i = a; i <= b; i++) {
			hap += i;
		}
		return hap;
	}

}
