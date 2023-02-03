package logicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		//Maharastra
		Scanner sc=new Scanner(System.in);
		System.out.println("Entering any String");
		String Orignstr = sc.next();
		String reverstr="";
		
		for(int i=Orignstr.length()-1;i>=0;i--)
		{
			char t = Orignstr.charAt(i);
			reverstr=reverstr+t;
		}
		System.out.println("Original String is" +Orignstr);
		System.out.println("revwrse String is "+reverstr);

	}

}
