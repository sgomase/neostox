package logicalProgram;

import java.util.Scanner;

public class Pallimdromstring {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any String");
		String orgstr = sc.next();
		String revstr="";
		for(int i=orgstr.length()-1;i>=0;i--)
		{
			char a = orgstr.charAt(i);
			revstr=revstr+a;
		}
		System.out.println("Original string is "+orgstr);
		System.out.println("ReversString is "+revstr);
		
		if(orgstr.equals(revstr))
		{
			System.out.println("String is pallimdrom");
		}
		else
		{
			System.out.println("String is not pallimdrom");
		}

	}

}
