package com.orange.classes;

//ΩÃ±€≈Ê ∆–≈œ
public class DrawUtil {
	private static DrawUtil drawUtilInstance;

	private DrawUtil() {
		System.out.println("Drawutil Constructor is called");
	}

	static DrawUtil getInstance() {
		if (drawUtilInstance == null) {
			drawUtilInstance = new DrawUtil();
		}
		return drawUtilInstance;
	}

	public void drawRect() {
		System.out.println("drawRect is OK");
	}

	public void drawCircle() {
		System.out.println("drawCircle is OK");
	}

	public void releaseInstance() {
		drawUtilInstance = null;
	}
}
