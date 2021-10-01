package kr.tpc;
public class Cat extends Animal{
	
	// 우클릭 후 source에서 override 클릭해도 생성 가능
	@Override
	public void eat() {
		System.out.println("고양이처럼 먹는다.");
	}

	public void night() {
		System.out.println("밤에 눈에서 빛이 난다.");
	}

}
