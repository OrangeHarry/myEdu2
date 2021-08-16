package com.orange.nestedinterface;

import com.orange.nestedinterface.Button.OnClickListener;

public class PushListener implements OnClickListener{
	@Override
	public void onClick() {
		System.out.println("PushListener onClick");
	}
}
