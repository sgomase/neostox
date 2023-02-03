package collectionStudy;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharInString {

	public static void main(String[] args)
	{
	  String s="abcdabcdxyzpqrxyzp";
	  
	  HashMap<Character,Integer>mp=new HashMap<Character,Integer>();
	  
	  for(int i=0;i<=s.length()-1;i++)
	  {
		  char t = s.charAt(i);
		  if(mp.containsKey(t))
		  {
			  mp.put(t, mp.get(t)+1);
		  }
		  else
		  {
			  mp.put(t, 1);
		  }
	  }

	     //System.out.println(mp);
	  
	   Set<Character> duplicateCount = mp.keySet();
	   for(Character d:duplicateCount)
	   {
		   System.out.println(d+":"+mp.get(d));
	   }
	   System.out.println("==============================");
	   
	   for(Character d:duplicateCount)
	   {
		   if(mp.get(d)>1)
		   {
			   System.out.println(d+":"+mp.get(d));
		   }
	   }
	}

}
