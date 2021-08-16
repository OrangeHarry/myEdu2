package com.orange.nestedinterface;

public class Anonymous {
	RemoConEx fieldRemoConEx = new RemoConEx() {//필드 초기값으로 필드에 재정의 한다.
		
		@Override
		public void setOn() {
			System.out.println("Anonymous field TV Set On");
		}
		@Override
		public void setOff() {
			System.out.println("Anonymous field TV Set Off");
		}
	};
	
	void method01() {//로컬 변수값으로 로컬변수 아래에서 재정의 되었다.
		RemoConEx localRemoConEx = new RemoConEx() {
			@Override
			public void setOn() {
				System.out.println("Anonymous local Radio Set On");
			}
			@Override
			public void setOff() {
				System.out.println("Anonymous local Radio Set Off");
			}
		};
		localRemoConEx.setOn(); // 로컬변수의 사용
	}
	
	void method02(RemoConEx remoConEx) {//인터페이스를 매개 변수로 받을 수 있는 메스드로 재정의 되었다.
		remoConEx.setOn();              //니들이 실행시킬 곳에서 직접 재정의 해서 써
	}

}
