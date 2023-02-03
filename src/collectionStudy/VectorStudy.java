package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector<Object>v=new Vector<>();
		
		v.add("Nagpur");
		v.add(125);
		v.add(40.23f);
		v.add('F');
		v.add(null);
		v.add("Hii");
		v.add("Pune");
		v.add(null);
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v);
		
		v.add(2, "Hello");
		System.out.println(v);
		System.out.println("=========================");
		
		//v.clear();
		System.out.println(v.isEmpty());
		System.out.println("=========================");
		
		System.out.println(v.elementAt(5));//get()
		System.out.println("=========================");
		
		System.out.println(v.firstElement());
		System.out.println("=========================");
		
		System.out.println(v.indexOf("Pune"));
		System.out.println("=========================");
		
		System.out.println(v.lastElement());
		System.out.println("=========================");
		
		System.out.println(v.lastIndexOf(null));
		System.out.println("=========================");
		System.out.println(v.remove(1));
		System.out.println(v);System.out.println("=========================");
		
		System.out.println("traversing through vector");
		//traversing through vector
		//for loop---> get?,for each,iterator,listiterator,enumerator
		
		System.out.println("========for loop==================");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("========for each loop==================");
		
		for(Object d:v)
		{
			System.out.println(d);
		}
		System.out.println("========iterator==================");
		
		Iterator<Object> E = v.iterator();
		while(E.hasNext())
		{
			System.out.println(E.next());
		}
		System.out.println("======== List iterator==================");
		
		ListIterator<Object> F = v.listIterator();
		while(F.hasNext())
		{
			System.out.println(F.next());
		}
		System.out.println("========Enumaratio==================");
		
		Enumeration<Object> G = v.elements();
		while(G.hasMoreElements())
		{
			System.out.println(G.nextElement());
		}

	}

}
