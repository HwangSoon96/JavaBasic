package kr.programmers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // JVM 실행 시에 해당 어노테이션을 감지할 수 있게 해주는 어노테이션
public @interface Count100 { // 어노테이션 만들면 이렇게 생긴다.

}
