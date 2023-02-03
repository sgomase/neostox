package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args)
	{
	 LinkedHashSet<String>lh=new LinkedHashSet<>();
	 lh.add("Pune");
	 lh.add("Mumbai");
	 lh.add("Nagpur");
	 lh.add("Pune");
	 lh.add(null);
	 lh.add(null);
	 lh.add("Thane");
	 
	 System.out.println(lh);
	 System.out.println(lh.size());
	 
	 System.out.println("=======for each=================");
	 
	 for(String c:lh)
	 {
		 System.out.println(c);
	 }
	 
	 System.out.println("=======iterator=================");
	 Iterator<String> D = lh.iterator();
	 
	 while(D.hasNext())
	 {
		System.out.println(D.next()); 
	 }
	 
	}

}
