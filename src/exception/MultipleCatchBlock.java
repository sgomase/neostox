package exception;

public class MultipleCatchBlock {

	public static void main(String[] args)
	{
		String a=null;
		try
		{
			System.out.println(a.charAt(5));
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("Index range from 0-2");
		}
		catch (NullPointerException e) 
		{
			System.out.println("a value shoud not be null");
		}
		
	}

}
