package com.orange.refertype;

public class ArrayDynamicTest {
	public static void main(String[] args) {
		// 사용할 개수를 정의하고, 해당 값을 넣을 수 있습니다.
//		String[] names = null;
//		names = new String[5];
		
		//이제 한줄로, 실무에선 이렇게 많이 쓰인다.
		String[] names = new String[5];

		names[0] = "민수";
		names[1] = "헌민";
		names[2] = "영희";
		names[3] = "길동";
		names[4] = "정현";

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}
	}
}
