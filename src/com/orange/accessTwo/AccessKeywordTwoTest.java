package com.orange.accessTwo;

import com.orange.access.AccessKeyword;

public class AccessKeywordTwoTest {
	public static void main(String[] args) {
		AccessKeyword accessKeyword = new AccessKeyword();
		accessKeyword.sample01 = 0;
//		accessKeyword.sample02 = 0; // default 같은 패키지라 접근가능
//		accessKeyword.sample03 = 0;

		System.out.println("accessKeyword.sample01 value is [" + accessKeyword.sample01 + "]");
//		System.out.println("accessKeyword.sample02 value is [" + accessKeyword.sample02 + "]");
//		System.out.println("accessKeyword.sample03 value is [" + accessKeyword.sample03 + "]");

		accessKeyword.run01();
//		accessKeyword.run02();
//		accessKeyword.run03();
	}
}