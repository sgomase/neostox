package exception;

public class ExpEg2 {

	public static void main(String[] args)
	{
	String a="abc";
	try 
	{
		System.out.println(a.charAt(5));//risky code
		System.out.println("Hello");
	
	}
	 catch (StringIndexOutOfBoundsException  e)
	{
		System.err.println("please select index range between 0-2");
	}
	 System.out.println("Good Night");
		

	}

}
