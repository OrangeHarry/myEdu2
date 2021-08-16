package com.orange.exception;

public class ThrowsClass {

//	public void findClass() throws ClassNotFoundException {
//		Class clazz = Class.forName("java.lang.StringTwo");
//		// 이런 메소드가 없기 때문에 ClassNotFoundException이 발생합니다.
//		// 여기서 try catch 하지 않고 이 메소드를 호출 하는 부분에서 Try catch하도록 할 때 쓴다.
//	}
	
	
	public void findClass() {
		try {
			Class clazz = Class.forName("java.lang.StringTwo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
