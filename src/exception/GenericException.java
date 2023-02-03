package exception;

public class GenericException {

	public static void main(String[] args)
	{
		String a=null;
		try
		{
			System.out.println(a.charAt(9));
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("please select range between 0-2");
		}
		catch (NullPointerException e)
		{
			System.out.println("a value should not be zero");
		}
		catch (Exception e)
		{
			System.out.println("exception occured");
		}

	}

}
