package pattern;

public class Eg12 {

	public static void main(String[] args)
	{
		// *****
		// ****
		// ***
		// **
		// *
		// **
		// ***
		// ****
		// *****
		//row=9;space=0;star=5;
		//outer for loop--row
		int star=5;
		
		for(int row=1;row<=9;row++)
		{
			//inner for loop
			
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}System.out.println();
			if(row<5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}

	}

}
