package com.methodoverriding.in;

public class WhatsApp3 extends WhatsApp2{
	@Override
	void sendMessage()
	{
		super.sendMessage();
		
		System.out.println("Blue tick supported");
			
	}
	@Override
	void story()
	{
		super.story();
		System.out.println("Videos can be uploaded");
	}
	
	void payment()
	{
		System.out.println("Can pay using WhatsApp");
	}

}
