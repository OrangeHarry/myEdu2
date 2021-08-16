package com.orange.nestedclasses;

public class OutClassExtend {

	public OutClassExtend() {
		System.out.println("OutClassExtend is Constructor");
	}

	void OutClassExtendMethod() {
		// 로컬클래스
		class LocalClass {
			int lid = 0;

			public LocalClass(int lid) {
				this.lid = lid;
				System.out.println("LocalClass is Constructor");
			}

			void localMethod() {
				System.out.println("LocalClass lid value is " + lid);
				System.out.println("localMethod is OK");
			}
		}

		LocalClass localClass = new LocalClass(450);
		localClass.lid = 10;
		localClass.localMethod();
	}
}
