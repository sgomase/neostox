package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class HashMapStudy {

	public static void main(String[] args)
	{
		HashMap<String,String>rto=new HashMap<String,String>();
		//put--->add
		
		rto.put("MH12", "Pune");
		rto.put("MH13", "Solapur");
		rto.put("MH14", "PCM<C");
		rto.put("MH15", "NASHIK");
		
		System.out.println(rto);
		
		rto.put("MH12", "Mumbai");
		System.out.println(rto);
		
		rto.put("MH01", "Mumbai");
		System.out.println(rto);
       
		System.out.println(rto.get("MH13"));
		
		System.out.println(rto.get("MH31"));
		
		System.out.println("=================================");
		//roll,stuname
		
		HashMap<Integer,String>stuinfo=new HashMap<Integer,String>();
		stuinfo.put(1, "Sachin");
		stuinfo.put(2, "Virendra");
		stuinfo.put(3, "VVS");
		stuinfo.put(4, "Dravid");
		
		System.out.println(stuinfo);
		
		System.out.println(stuinfo.get(3));
		
		System.out.println(stuinfo.get(5));
		System.out.println("===========================");
		
		Set<Integer>stdinf=stuinfo.keySet();
		for(Integer s:stdinf)
		{
			//System.out.println(s);
			System.out.println(s+":"+stuinfo.get(s));
		}
	}

}
