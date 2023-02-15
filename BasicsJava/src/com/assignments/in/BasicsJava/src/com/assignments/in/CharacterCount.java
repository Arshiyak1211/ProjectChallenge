package com.assignments.in;

public class CharacterCount {
	static int characterCount(String s,String t)
	{
		int count=0;
		char key=t.charAt(0);
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==key)
				count++;
		}
		return count;
	}
public static void main(String[] args)
{
	String s="How are you";
	String t="w";
	System.out.println(characterCount(s,t));
}
}
