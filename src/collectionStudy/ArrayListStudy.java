package collectionStudy;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		
		al.add("Velocity");
		al.add(123);
		al.add(23.14f);
		al.add('A');
		al.add(null);
		al.add("Hello");
		al.add(null);
		
		System.out.println(al);
		System.out.println("=====================================");
		
		ArrayList<String> al1=new ArrayList<>();
		System.out.println(al1.add("Hi"));
		al1.add("Hello");
		al1.add(2,"Gm");
		System.out.println(al1);
		
		System.out.println("=====================================");
		 
		//al1.clear();
		System.out.println(al1);
		
		System.out.println("=====================================");
		
		Object al2 = al1.clone();
		System.out.println(al1);
		System.out.println(al2);

		System.out.println("=====================================");
		
		System.out.println(al1.contains("GM"));
		System.out.println(al1.contains("GN"));
		System.out.println("=====================================");
		
		String ele = al1.get(2);
		System.out.println(ele);
		System.out.println("=====================================");
		
		System.out.println(al1.indexOf("Hello"));
		System.out.println("=====================================");
		
		System.out.println(al1.isEmpty());
		System.out.println("=====================================");
		
		System.out.println(al1.remove(0));
		System.out.println(al1);
		System.out.println(al1.remove("Gm"));
		System.out.println(al1);
		System.out.println("=====================================");
		
		al1.set(0,"Gn" );
		System.out.println(al1);
		System.out.println("=====================================");
		
		System.out.println(al1.size());
		
		
		
		
		
		
		
		
		
		
		

	}

}
