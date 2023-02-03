package pattern;

public class Eg8 {

	public static void main(String[] args)
	{
		//*******
		 //*****
         // ***
		//   *
		
		//row=4,column=7,space=0;star=7
		
		//outer for loop
		int space=0;
		int star=7;
		
		for(int row=1;row<=4;row++)
		{
			
			//outter for loop 
			//space
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
			
		}
		
	}

}
