package com.orange.classes;

public class ConnectUtilTest {
	public static void main(String[] args) {
		ConnectUtil.getInstance().connectStockFirm();// 생성과 메소드 호출을 한번에 할 수 있다.
		ConnectUtil.getInstance().releaseInstance();// 다 쓰고나면 자원해재 하여줍니다.

		ConnectUtil.getInstance().connectBank();// 자원 해재가 되었으므로 새로 생성하고 호출됩니다.
		ConnectUtil.getInstance().releaseInstance();
	}
}
