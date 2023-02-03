package pattern;

public class Eg14 {

	public static void main(String[] args) 
	{
	   // *         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   **** 
		//***     ***
		//**       **
		//*         *
		//row=9,space1=5;star=1;space2=4,
		//outer for loop
		int star1=1;
		int space1=5;
		int star2=1;
		int space2=4;
		for(int row=1;row<=9;row++)
		{
			//inner for loop---space1
			
			for(int j=1;j<=star1;j++)//for star
			{
				System.out.print("*");
			}
			for(int i=1;i<=space1;i++)
			{
				System.out.print(" ");
			}
			
			for(int l=1;l<=star2;l++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=space2;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			if(row<5)
			{
				star1++;
				space1--;
				star2++;
				space2--;
				
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
			
		}

	}

}
