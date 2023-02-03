package pattern;

public class Eg10 {

	public static void main(String[] args) 
	{
		//   *
		//  * *
		// * * *
		//* * * *
		//outer for loop
		int star=1;
		int space=3;
		for(int row=1;row<=4;row++)
		{
			//inner for loop
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int column=1;column<=star;column++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}

	}

}
