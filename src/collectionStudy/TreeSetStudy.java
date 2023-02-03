package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args)
     {
		
      TreeSet<Object>ts=new TreeSet<>();
      
      ts.add(1);
      ts.add(5);
      ts.add(4);
      ts.add(2);
      ts.add(9);
      ts.add(7);
      ts.add(3);
      ts.add(8);
      ts.add(10);
      ts.add(6);
      
      System.out.println(ts);
      System.out.println(ts.first());
      System.out.println(ts.last());
      
      System.out.println(ts.ceiling(7));
      System.out.println(ts.floor(2));
      
      System.out.println(ts.higher(5));
      System.out.println(ts.lower(9));
      
      System.out.println("=============for each====================");
      
      for(Object L:ts)
      {
    	  System.out.println(L);
      }
      System.out.println("=============iterator====================");
      
      Iterator<Object> G = ts.iterator();
      
      while(G.hasNext())
      {
    	  System.out.println(G.next());
      }
      
      
      
	}

}
