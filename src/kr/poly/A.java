package kr.poly;

import java.lang.*; // 기본으로 다 들어가 있어서 생략

public class A extends Object { // extends Object 기본으로 다 들어가 있어서 생략

	// 기본 생성자 메서드 기본으로 다 들어가 있어서 생략
	public A() {
		super();
	}
	
	public void dispaly() {
		System.out.println("나는 A 입니다.");
	}
	
	// toString()
	@Override
	public String toString() {
		return "재정의 메서드 입니다.";
	}

}
