package logicalProgram;

public class CountNumOfBlanckSpace {

	public static void main(String[] args) {
		 //s  arika
		String s="S  arika  ";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char t = s.charAt(i);
			if(t==' ')
			{
				count++;
			}
		}
		System.out.println("Number of blanck space are "+count);

	}

}
