package com.orange.classes;

public class DrawUtilTest싱글톤 {
	public static void main(String[] args) {
		DrawUtil.getInstance();// 1회 생성
		DrawUtil.getInstance().drawRect();
		DrawUtil.getInstance().releaseInstance();// 생성된 instance 삭제

		DrawUtil.getInstance();// 다시생성
		DrawUtil.getInstance().drawCircle();
		DrawUtil.getInstance().releaseInstance();// 사용이 끝나면 리소스반환 꼭 해준다.
	}
}
