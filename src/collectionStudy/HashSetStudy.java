package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
		HashSet<Object> hs = new HashSet<>();
		
		hs.add("Pune");
		hs.add("Nagpur");
		hs.add('A');
		hs.add(452);
		hs.add(41.36);
		hs.add(null);
		hs.add("Pune");
		hs.add(null);
		
		System.out.println(hs);
		
		//hs.remove("Pune");
		
		// we cant use loop in set---> we dont get method
    System.out.println("============for each========");
    
       for(Object a:hs)
       {
    	   System.out.println(a);
       }
       System.out.println("============iterator========");
       
       Iterator<Object> b = hs.iterator();
       while(b.hasNext())
       {
    	   System.out.println(b.next());
       }
	}

}
