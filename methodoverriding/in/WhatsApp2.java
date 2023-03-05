package com.methodoverriding.in;

public class WhatsApp2 extends WhatsApp1 {
	
@Override
void sendMessage()
{
	super.sendMessage();
	
	System.out.println("Double tick supported");
		
}
void story()
{
	System.out.println("Images can be uploaded as story");
}


}
