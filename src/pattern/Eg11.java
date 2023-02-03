package pattern;

public class Eg11 {

	public static void main(String[] args)
	{
		// * * * * 
		//  * * *
		//   * *
		//    *
		
		int star=4;
		int space=0;
		
		for(int row=1;row<=4;row++)
		{
			//outer for loop
			//space
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int column=1;column<=star;column++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
		}

	}

}
