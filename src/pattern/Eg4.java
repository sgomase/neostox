package pattern;

public class Eg4 {

	public static void main(String[] args)
	{
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		//row->5, column->5
		//outer for loop-->row
		int star=1;
		for(int row=1;row<=5;row++)
		{
			//inner for loop
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}

}
