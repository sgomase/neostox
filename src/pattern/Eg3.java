package pattern;

public class Eg3 {

	public static void main(String[] args)
	{
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		
	//rows->5, column->5
		//outer for loop--->row
		
		for(int row=1;row<=5;row++)
		{
			//inner for loop
			for(int column=1;column<=5;column++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		

	}

}
