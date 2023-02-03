package pattern;

public class Eg5 {

	public static void main(String[] args)
	{
//		*****
//		****
//		***
//		**
//		*
		//outer for loop
		int star=5;
		for(int row=1;row<=5;row++)
		{
			//inner for loop
			for(int column=1;column<=star;column++)
				
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		

	}

}
