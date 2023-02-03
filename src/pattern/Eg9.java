package pattern;

public class Eg9 {

	public static void main(String[] args)
	{
		
		//   *
		//  ***
		// *****
		//*******
		
		//row=4;space=3; star=1
		//outer for loop
		int space=3;
		int star=1;
		for(int row=1;row<=4;row++)
		{
			//inner for loop 
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
			space--;
			star=star+2;
		}
	}

}
