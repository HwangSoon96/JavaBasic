package kr.poly;

import java.lang.*; // �⺻���� �� �� �־ ����

public class A extends Object { // extends Object �⺻���� �� �� �־ ����

	// �⺻ ������ �޼��� �⺻���� �� �� �־ ����
	public A() {
		super();
	}
	
	public void dispaly() {
		System.out.println("���� A �Դϴ�.");
	}
	
	// toString()
	@Override
	public String toString() {
		return "������ �޼��� �Դϴ�.";
	}

}
