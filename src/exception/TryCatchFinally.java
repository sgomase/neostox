package exception;

public class TryCatchFinally {

	public static void main(String[] args)
	{
		String a="abc";
		try 
		{
			System.out.println(a.charAt(9));
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("index range from 0-2");
		}
		catch (NullPointerException e) 
		{
			System.out.println("a value should not be null");
		}
		catch (Exception e) 
		{
			
		}
		finally
		{
			System.out.println("Bye.......!");
		}
		
		

	}

}
