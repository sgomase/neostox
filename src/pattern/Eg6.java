package pattern;

public class Eg6 {

	public static void main(String[] args)
	{
//		*****
//		 ****
//		  ***
//		   **
//		    *
		int space=0;
		int star=5;
		//outer for loop
		for(int row=1;row<=5;row++)
		{
			//inner for loop-->cloumn
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
			star--;
		}

	}

}
