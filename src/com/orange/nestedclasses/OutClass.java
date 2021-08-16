package com.orange.nestedclasses;

public class OutClass {

	// ������
	public OutClass() {
		System.out.println("OutClasses is Constructor");
	}

	// �ν��Ͻ� ��� Ŭ�����Դϴ�.
	class NestedClass01 {
		// �ʵ�
		int nld = 0;

		// ������
		public NestedClass01() {
			System.out.println("NestedClass01 Constructor");
		}

		// �޼ҵ�
		void nestedClass01Method() {
			System.out.println("NestedClass01 id value is " + this.nld);
			System.out.println("nestedClass01Method call....");
		}
	}

	// static ��� Ŭ����
	static class StaticClass01 {
		// �ʵ�
		int sId = 0;
		static int nameId = 100;

		// ������
		public StaticClass01() {
			System.out.println("StaticClass01 Constructor");
		}

		// �޼ҵ�
		void staticNestedClassMethod() {
			System.out.println("StaticNestedClassMethod sId value is " + sId);
			System.out.println("staticNestedClassMethod call....");
		}

		static void staticNestedClassStaticMethod() {
			System.out.println("staticNestedClassStaticMethod nameId value is " + nameId);
			System.out.println("staticNestedClassStaticMethod call...");
		}
	}

	//�ǽ� Ŭ����
	class NestedClassTwo {
		int nameId;

		void nestedClassTwoMethod() {
			System.out.println("nestedClassTwoMethod nameId value is " + this.nameId);
			System.out.println("nestedClassTwoMethod called");
		}
	}
}
//�ν��Ͻ� ��� Ŭ������ ���� static�� ����� �� ����.