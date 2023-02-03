package logicalProgram;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) 
	{
		//4!=4*3*2*1=24
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+num+"is " +fact);

	}

}
