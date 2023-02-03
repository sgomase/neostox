package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList<Object>ll=new LinkedList<>();
		
		ll.add("Pune");
		ll.add(456);
		ll.add(25.36);
		ll.add(null);
		ll.add(true);
		ll.add("Pune");
		ll.add(null);
		ll.add('A');
		
		System.out.println(ll);
		System.out.println("==========================");
		ll.add(3, "Hello");
		System.out.println(ll);
		System.out.println("==========================");
		
         ll.addFirst("Hi");
         ll.addLast("Gm");
         System.out.println(ll);
         System.out.println("==========================");
         
         //ll.clear();
         System.out.println(ll);
         System.out.println("==========================");
         System.out.println(ll.contains("Pune"));
         System.out.println("==========================");
         
        System.out.println( ll.element());
        System.out.println(ll);
        System.out.println("==========================");
        
        System.out.println(ll.get(2));
        System.out.println("==========================");
        
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll);
        System.out.println("==========================");
        
        ll.indexOf("Pune");
        System.out.println(ll.size());
        ll.set(5, "Katraj");
         System.out.println(ll);   
         System.out.println("==========================");
        System.out.println( ll.peek());
         System.out.println(ll);         
        System.out.println( ll.poll());
        System.out.println(ll);
        System.out.println("==========================");
        
       System.out.println( ll.peekFirst());
       System.out.println(ll.peekLast());
       System.out.println(ll);
       System.out.println("==========================");
       
      System.out.println( ll.pollFirst());
     System.out.println( ll.pollLast());
     System.out.println(ll);
     System.out.println("==========================");
     
        System.out.println(ll.pop());
          System.out.println(ll);
          System.out.println("==========================");
          ll.push("Mumbai");
          System.out.println(ll);
          
          ll.remove(0);
          System.out.println(ll);
          System.out.println("==========================");
          
          System.out.println("==========for loop====================");
          
          for(int i=0;i<=ll.size()-1;i++)
          {
        	  System.out.println(ll.get(i));
          }
          System.out.println("==========each===================");
          
          for(Object A:ll)
          {
        	  System.out.println(A);
          }
          System.out.println("==========iterator===================");
          
          Iterator<Object> B = ll.iterator();
         while(B.hasNext())
         {
        	 System.out.println(B.next());
         }
         
         System.out.println("==========List iterator===================");
         
         ListIterator<Object> C = ll.listIterator();
         
         while(C.hasNext())
         {
        	 System.out.println(C.next());
         }
         
       
         
	}

	
	}


