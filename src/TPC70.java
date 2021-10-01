public class TPC70 {
	
	// 1. 클래스 안에 인스턴스 변수, 즉 필드를 선언하는 위치에 선언되는 경우. 보통 중첩클래스 혹은 인스턴스 클래스라고 한다.
	class Cal {
		int value = 0;
		
		public void plus() {
			value++;
		}
	}
	
	// 2. 내부 클래스가 static으로 정의된 경우, 정적 중첩 클래스 또는 static 클래스라고 한다
	static class Cal2 {
		int value = 0;
		
		public void plus() {
			value++;
		}
	}
	
	// 3. 메소드 안에 클래스를 선언한 경우, 지역 중첩 클래스 또는 지역 클래스라고 한다.
	public void exec() {
		class Cal3 {
			int value = 0;
			
			public void plus() {
				value++;
			}
		}
		Cal3 cal3 = new Cal3();
		cal3.plus();
		cal3.plus();
		cal3.plus();
		System.out.println(cal3.value);
	}
	
	public static void main(String[] args) {
		
		// 내부 클래스 -> 클래스 안에 선언된 클래스
		// 어느 위치에 선언하느냐에 따라 4가지 형태 존재
		// 여기서는 3개, 나머지 하나는 다음
		
		// 1. 내부에 있는 Cal객체를 생성하기 위해서는, 밖에는 TPC70의 객체를 만든 후에 TPC70.Cal cal = t.new Cal();과 같은 방법으로 Cal 객체를 생성한 후 사용한다.
		TPC70 tpc = new TPC70();
		TPC70.Cal cal = tpc.new Cal();
		cal.plus();
		System.out.println(cal.value);
		
		// 2. 필드 선언할 때 스태틱한 필드로 선언한 것과 같다. 이 경우에는 TPC70 객체를 생성할 필요없이 new TPC70.Cal()로 객체를 생성할 수 있다.
		TPC70.Cal2 cal2 = new TPC70.Cal2();
		cal2.plus();
		cal2.plus();
		System.out.println(cal2.value);
		
		// 3. 메소드 안에서 해당 클래스를 이용할 수 있다.
		TPC70 tpc3 = new TPC70();
		tpc3.exec();
		
	}
}
