package com.orange.classes;

public class DrawUtilTest�̱��� {
	public static void main(String[] args) {
		DrawUtil.getInstance();// 1ȸ ����
		DrawUtil.getInstance().drawRect();
		DrawUtil.getInstance().releaseInstance();// ������ instance ����

		DrawUtil.getInstance();// �ٽû���
		DrawUtil.getInstance().drawCircle();
		DrawUtil.getInstance().releaseInstance();// ����� ������ ���ҽ���ȯ �� ���ش�.
	}
}
