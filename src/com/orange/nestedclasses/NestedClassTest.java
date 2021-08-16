package com.orange.nestedclasses;

public class NestedClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();

		OutClass.NestedClass01 nestedClass01 = outClass.new NestedClass01();
		// 인스턴스멤버 클래스이므로 .으로 접근하고 new로 생성합니다.(이유는 안쪽에 내포된 클래스라는 것을 표시해줘야 하기 때문)
		nestedClass01.nld = 1;
		nestedClass01.nestedClass01Method();

		System.out.println("============================================");

		OutClass.StaticClass01 staticClass01 = new OutClass.StaticClass01();
		// 얘는 static 클래스라서 요렇게 가져다 쓴다.
		// new라는 키워드를 사용할때 내가 어느 클래스의 하위 클래스라는 것을 명시해 줘야한다.
		staticClass01.sId = 2;
		staticClass01.staticNestedClassMethod();

		staticClass01.nameId = 90;
		staticClass01.staticNestedClassStaticMethod();
		System.out.println("============================================");

		OutClass.NestedClassTwo nestedClassTwo = outClass.new NestedClassTwo();
		nestedClassTwo.nameId = 3;
		nestedClassTwo.nestedClassTwoMethod();
	}
}
