package Collection;

import java.util.HashSet;
import java.util.Iterator;


public class _HashSet
{
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(null);
		hs.add("ganesh");
		hs.add(100);
		hs.add('A');
		hs.add(null);
		hs.add("ganesh");
		
		System.out.println(hs);
		System.out.println("Size of HashSet:"+hs.size());  //4
		System.out.println(hs.contains(100));  //true
		System.out.println(hs.isEmpty()); //false
		hs.remove('A');
		System.out.println(hs);
	
		
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
