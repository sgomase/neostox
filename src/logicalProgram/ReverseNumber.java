package logicalProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		// int a=1234;
		//number----->String
		//String--->number
		
		int orgnum=1234;
		String orgStr = Integer.toString(orgnum);
		String revstr="";
		for(int i=orgStr.length()-1;i>=0;i--)
		{
			char d = orgStr.charAt(i);
			revstr=revstr+d;
		}
		int revNum = Integer.parseInt(revstr);
		System.out.println("Original number is "+orgStr);
		System.out.println("Revers String is "+revstr);

	}

}
