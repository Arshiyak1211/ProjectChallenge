package com.multilevelinheritence.in;

public class Solution {
public static void main(String[] args)
{
	Department d=new Department();
	
	d.conductExams();
	
	System.out.println("The univercity name is "+d.univercityName);
	
	System.out.println("The department name is "+d.departmentName);
}
}
