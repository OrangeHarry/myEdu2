package com.orange.nestedclasses;

public class NestedClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();

		OutClass.NestedClass01 nestedClass01 = outClass.new NestedClass01();
		// �ν��Ͻ���� Ŭ�����̹Ƿ� .���� �����ϰ� new�� �����մϴ�.(������ ���ʿ� ������ Ŭ������� ���� ǥ������� �ϱ� ����)
		nestedClass01.nld = 1;
		nestedClass01.nestedClass01Method();

		System.out.println("============================================");

		OutClass.StaticClass01 staticClass01 = new OutClass.StaticClass01();
		// ��� static Ŭ������ �䷸�� ������ ����.
		// new��� Ű���带 ����Ҷ� ���� ��� Ŭ������ ���� Ŭ������� ���� ����� ����Ѵ�.
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
