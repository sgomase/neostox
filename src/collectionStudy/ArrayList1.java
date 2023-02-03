package collectionStudy;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		ArrayList<Object>al=new ArrayList<>();
		
		al.add("Hi");
		al.add(123);
		al.add('A');
		al.add(null);
		al.add(14.23f);
		al.add(true);
		
      System.out.println(al);
      
      //traversing using for loop
      //System.out.println(===========using for loop=============);
    		  
    		  for(int i=0;i<=al.size()-1;i++)
    		  {
    			  System.out.println(al.get(i));
    		  }
    		
    		  
    		  System.out.println("==========using  iterator=============");
    		  
    		  Iterator<Object> B = al.iterator();
    		  while(B.hasNext())
    		  {
    			  System.out.println(B.next());
    			  
    		  }
    		  System.out.println("==========using  list iterator=============");
    		  
    		  ListIterator<Object> C = al.listIterator();
    		  while(C.hasNext())
    		  {
    			  System.out.println(C.next());
    		  }
    		  System.out.println("==========using each=============");
    		  for(Object a:al)
    		  {
    			  System.out.println(a);
    		  }
    		  
    		  
	}
	

}
