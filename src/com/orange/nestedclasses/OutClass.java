package com.orange.nestedclasses;

public class OutClass {

	// 생성자
	public OutClass() {
		System.out.println("OutClasses is Constructor");
	}

	// 인스턴스 멤버 클래스입니다.
	class NestedClass01 {
		// 필드
		int nld = 0;

		// 생성자
		public NestedClass01() {
			System.out.println("NestedClass01 Constructor");
		}

		// 메소드
		void nestedClass01Method() {
			System.out.println("NestedClass01 id value is " + this.nld);
			System.out.println("nestedClass01Method call....");
		}
	}

	// static 멤버 클래스
	static class StaticClass01 {
		// 필드
		int sId = 0;
		static int nameId = 100;

		// 생성자
		public StaticClass01() {
			System.out.println("StaticClass01 Constructor");
		}

		// 메소드
		void staticNestedClassMethod() {
			System.out.println("StaticNestedClassMethod sId value is " + sId);
			System.out.println("staticNestedClassMethod call....");
		}

		static void staticNestedClassStaticMethod() {
			System.out.println("staticNestedClassStaticMethod nameId value is " + nameId);
			System.out.println("staticNestedClassStaticMethod call...");
		}
	}

	//실습 클래스
	class NestedClassTwo {
		int nameId;

		void nestedClassTwoMethod() {
			System.out.println("nestedClassTwoMethod nameId value is " + this.nameId);
			System.out.println("nestedClassTwoMethod called");
		}
	}
}
//인스턴스 멤버 클래스의 경우는 static을 사용할 수 없다.