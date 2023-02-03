package logicalProgram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		// even num----2-->reminder-->0
		Scanner sc=new Scanner(System.in);
		System.out.println("Entering any number");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd");
		}

	}

}
