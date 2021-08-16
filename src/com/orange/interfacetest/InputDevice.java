package com.orange.interfacetest;

public interface InputDevice extends PhysicalButton, ScreenTouch, EarPhoneSocket{
	abstract void alertError();
}
