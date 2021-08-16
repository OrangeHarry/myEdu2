package com.orange.refertype;

public class StringReferTest {
	public static void main(String[] args) {
		String sampleA = new String("Lee");// new keyword는 델리게이션 메모리에 새로 올린다는 의미입니다.
		String sampleB = new String("Lee");// 그러므로 sampleA, sampleB는 각기 다른 객체입니다.
		// 두개가 서로 다른 객체로 다른 주소에 올라가 있습니다.
//		if (sampleA == sampleB) {
//			System.out.println("sampleA == sampleB");
//		} else {
//			System.out.println("sampleA != sampleB");
//		}

		if (sampleA.equals(sampleB)) {
			System.out.println("sampleA, sampleB is same");
		} else {
			System.out.println("Two sample is not same");
		}
	}
}
