import java.lang.reflect.Method;
import kr.programmers.Count100;
import kr.programmers.MyHello;

public class TPC59 {
	public static void main(String[] args) {
		
		// 어노테이션은 클래스나 메소드 위에 붙습니다. @(at)기호로 이름이 시작합니다.
		// 어노테이션을 클래스나 메타코드에 붙인 후, 클래스가 컴파일되거나 실행될 때 어노테이션의 유무나 어노테이션에 설정된 값을 통하여 클래스가 좀 더 다르게 실행되게 할 수 있습니다.
		// 이런 이유로 어노테이션을 일정의 설정파일처럼 설명하는 경우도 있습니다.
		
		// 어노테이션은 자바가 기본으로 제공해주는 것도 있고, 사용자가 직접 만들 수도 있습니다.
		// 사용자가 직접 작성하는 어노테이션을 Custom 어노테이션이라고 말합니다.
		
		// 커스텀 어노테이션을 이용하는 방법
		// 어노테이션을 정의한다.
		// 어노테이션을 클래스에서 사용한다. (타겟에 적용)
		// 어노테이션을 이용하여 실행.
		
		// 그러나 신입은 현업에서 어노테이션을 만들어서 사용하는 경우는 드물다. -> 누군가 만들어놓은 어노테이션 이용하면서 그거 숙지하는 걸 더 많이 할듯
		
		MyHello hello = new MyHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello"); // hello 객체를 만들 때 사용한 클래스 정보를 받아서 그 정보로부터 hello 메서드에 대한 정보를 줘라
			
			if(method.isAnnotationPresent(Count100.class)) { // 만약 메서드에 Count100 어노테이션이 적용되어 있다면
				for(int i = 0; i < 100; i++) {
					hello.hello(); // 어노테이션 적용되어 있으므로 hello 100번 출력된다.
				}
			} else {
				hello.hello();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
}
