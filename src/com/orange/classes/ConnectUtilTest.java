package com.orange.classes;

public class ConnectUtilTest {
	public static void main(String[] args) {
		ConnectUtil.getInstance().connectStockFirm();// ������ �޼ҵ� ȣ���� �ѹ��� �� �� �ִ�.
		ConnectUtil.getInstance().releaseInstance();// �� ������ �ڿ����� �Ͽ��ݴϴ�.

		ConnectUtil.getInstance().connectBank();// �ڿ� ���簡 �Ǿ����Ƿ� ���� �����ϰ� ȣ��˴ϴ�.
		ConnectUtil.getInstance().releaseInstance();
	}
}
