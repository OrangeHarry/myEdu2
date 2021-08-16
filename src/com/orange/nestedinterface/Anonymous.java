package com.orange.nestedinterface;

public class Anonymous {
	RemoConEx fieldRemoConEx = new RemoConEx() {//�ʵ� �ʱⰪ���� �ʵ忡 ������ �Ѵ�.
		
		@Override
		public void setOn() {
			System.out.println("Anonymous field TV Set On");
		}
		@Override
		public void setOff() {
			System.out.println("Anonymous field TV Set Off");
		}
	};
	
	void method01() {//���� ���������� ���ú��� �Ʒ����� ������ �Ǿ���.
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
		localRemoConEx.setOn(); // ���ú����� ���
	}
	
	void method02(RemoConEx remoConEx) {//�������̽��� �Ű� ������ ���� �� �ִ� �޽���� ������ �Ǿ���.
		remoConEx.setOn();              //�ϵ��� �����ų ������ ���� ������ �ؼ� ��
	}

}
