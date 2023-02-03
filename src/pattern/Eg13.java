package pattern;

public class Eg13 {

	public static void main(String[] args)
	{
		//  *
		//  **
		//  ***
		//  ****
		//  ***
		//  **
		//  *
		
		//row=7;star=1; column=4
		//outer for loop
		int star=1;
		for(int row=1;row<=7;row++)
		{
			//inner loop
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(row<4)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	
		

	}

}
