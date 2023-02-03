package logicalProgram;

public class armstrongNum {

	public static void main(String[] args)
	{
		// eg. 0,1,153,370 armstrong number
		
		int orgNum=371;
		int sum=0;
		for(int i=orgNum;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if(orgNum==sum)
		{
			System.out.println("Given no "+orgNum+ " is armstrong");
		}
		else
		{
			System.out.println("Given no "+orgNum+ " is not  armstrong");
		}

	}

}
