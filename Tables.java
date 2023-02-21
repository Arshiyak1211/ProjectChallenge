package com.programs.in;
import java.util.Scanner;
public class Tables {
	public static void main(String[] args)
	{
		String yn;
		do
		{
			
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number you want to print the table");
		int no=s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
		System.out.println(no+"*"+i+"="+no*i);
		}
		
		System.out.println("Do you want to continue(press y for Yes and n for No)");
		yn=s.next();
		
		}while(yn.equals("y")||yn.equals("Y"));
	}

}
